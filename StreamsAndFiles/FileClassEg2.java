// File class in java

import java.io.*;

class FileClassEg2
{
    public static void main(String args[])
    {
        File dir = new File("C:\\Users\\Admin\\Documents\\Assignments");
 
        String fileNames[] = dir.list();

        for(String fName : fileNames)
        {
            System.out.println(fName);
        }
    }
}