// File class in java

import java.io.*;

class FileClassEg3
{
    public static void main(String args[])
    {
        File dir = new File("C:\\Users\\Admin\\Documents\\Assignments");
 
        File files[] = dir.listFiles();

        for(File f : files)
        {
            System.out.println("File name :"+f.getName());
            System.out.println("File length :"+f.length());
        }
    }
}