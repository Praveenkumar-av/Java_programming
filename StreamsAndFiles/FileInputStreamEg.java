// Reading data from a file using FileInputStream 

import java.io.*;
class FileInputStreamEg
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin = new FileInputStream("file1.txt");

        System.out.println("File contents :");

        // read characters from FileInputStream and write them to monitor.
        // read() method returns -1 if it reaches the end of the file.
        int ch;
        while((ch = fin.read()) != -1)
        {
            System.out.print((char)ch);
        }

        // close the file
        fin.close();
    }
}