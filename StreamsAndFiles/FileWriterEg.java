// Creating a File using FileWriter

import java.io.*;
class FileWriterEg
{
    public static void main(String args[]) throws IOException
    {
        // take a string 
        String str = "This file is creted by FileWriterEg\nI am a learner of Java.";

        // attach file to FileWriter
        FileWriter fw = new FileWriter("file3.txt");

        // read character wise from string and write into FileWriter
        for(int i=0;i<str.length();i++)
            fw.write(str.charAt(i)); 

        // close the file
        fw.close();
    }
}