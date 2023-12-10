// File class in java

import java.io.*;

class FileClassEg1
{
    public static void main(String args[])
    {
        File f = null;
        try
        {
            f = new File("file1.txt");
            if(f.createNewFile())
            {
                System.out.println("new file is created");
            }
            else 
            {
                System.out.println("file already exists");
            }
        }
        catch(IOException ie)
        {
            System.out.println("Some error :" + ie);
        }   

        System.out.println("File readable :"+f.canRead());
        System.out.println("File writable :"+f.canWrite());
        System.out.println("File exixts :"+f.exists());
        System.out.println("File name :"+f.getName());
        System.out.println("File absolute path :"+f.getAbsolutePath());
        System.out.println("File length in bytes :"+f.length());
    }
}