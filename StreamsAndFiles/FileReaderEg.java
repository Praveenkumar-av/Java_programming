// Reading a File using FileReader

import java.io.*;
class FileReaderEg
{
    public static void main(String args[]) throws IOException
    {
        // var
        int ch;

        // check if file exists or not
        FileReader fr = null;

        try
        {
            fr = new FileReader("file3.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found!");
            return;
        }

        // read from FileReader till the end of file
        while((ch = fr.read()) != -1)
        {
            System.out.print((char)ch);
        }
    }
}