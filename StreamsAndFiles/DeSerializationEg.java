// de-serialization -> to retrieve objects from objfile.

import java.io.*;
import java.util.Scanner;
class DeSerializationEg
{
    public static void main(String args[]) throws Exception
    {
        // connect FileInputStream to objfile
        FileInputStream fis;
        try
        {
            fis = new FileInputStream("objfile.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
            return;
        }

        // connect ObjectInputStream to FileInputStream 
        ObjectInputStream ois = new ObjectInputStream(fis);

        // read object from ois and store data into Employee object e
        try
        {
            Employee e;
            while((e = (Employee)ois.readObject()) != null)
            {
                // display data to monitor
                e.displayData();
            }
        }
        catch(EOFException ee)
        {
            System.out.println("End of file reached");
        }
        finally
        {
            // close the file
            ois.close();
        }
    }
}