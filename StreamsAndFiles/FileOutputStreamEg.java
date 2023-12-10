// Creating a file using FileOutputStream

import java.io.*;

class FileOutputStreamEg 
{
    public static void main(String args[]) throws IOException
    {
        // attach keyboard to DataInputStream
        DataInputStream dis = new DataInputStream(System.in);

        // attach file to FileOutputStream 
        FileOutputStream fout = new FileOutputStream("file1.txt");

        // to open the file in append mode
        // FileOutputStream fout = new FileOutputStream("file1.txt",true);

        // writing some text into the file
        String str = "This is created by FileOutputStreamEg.java\n";
        int n = str.length();
        for(int i=0;i<n;i++)
            fout.write((char)str.charAt(i));

        // writing the text read from user
        char ch;
        System.out.println("Enter text (@ at the end) :");
        // read characters from dis into ch. Then write then into fout.
        // repeat this as long as the read character is not @
        while((ch = (char)dis.read()) != '@')
            fout.write(ch);

        // close the file
        fout.close();
    }
}