// Serialization of objects
// storing the objects to a file

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable
{
    int id;
    String name;
    float sal;

    void displayData()
    {
        System.out.println("\nId :"+id);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+sal);
    }

    void getData()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the id :");
        id = scan.nextInt();
        System.out.print("Enter the name :");
        name = scan.next();
        System.out.print("Enter the Salary :");
        sal = scan.nextFloat();
    }
}

class SerializationEg 
{
    public static void main(String args[]) throws IOException
    {
        Employee e;

        Scanner scan = new Scanner(System.in);

        // connect FileOutStream to the file
        FileOutputStream fos = new FileOutputStream("objfile.txt");

        // connect objectOutputStream to the FileOutputStream 
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.print("Enter the no. of details :");
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        { 
            // create Emplyee object
            e = new Employee();

            // store data into it
            e.getData();

            // write data into file
            oos.writeObject(e);
        }

        // close the file
        oos.close();
    }
}