// Reading characters from a file using BufferedInputStream 

import java.io.*;
import java.util.Scanner;
class BufferedInputStreamEg
{
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        String fname;
        System.out.println("Enter the file name :");
        fname = scan.next();

        FileInputStream fin = null;  // assign null to fin
        try 
        {
            // check if file exists or not
            fin = new FileInputStream(fname);
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found!");
            return;
        }

        // attach FileInputStream to BufferedInputStream
        BufferedInputStream bin = new BufferedInputStream(fin);

        System.out.println("File contents :");
        // read characters from BufferedInputStream and write them
        int ch;
        while((ch = bin.read()) != -1)
        {
            System.out.print((char)ch);
        }

        // close the file
        bin.close();
    }
}