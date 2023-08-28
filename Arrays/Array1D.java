// single dimensional array in Java

import java.util.Scanner;
class Array1D 
{
    public static void main(String[] args)
    {
        // creating a single dimensional array
        int marks[] = { 10, 20, 30, 40, 50 };

        String name[];          // declaring an array
        name = new String[5];   // allocating memory to array for storing 5 elements

        int roll[] = new int[5];    // declaring and allocating memory to array

        // elements of array can be accessed using index
        name[0] = "Rahul";
        name[1] = "Raj";
        name[2] = "Rohan";
        name[3] = "Ramesh";
        name[4] = "Rajesh";

        // we can use loop to read elements of array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roll numbers of 5 students: ");
        for(int i = 0; i < 5; i++)
        {
            roll[i] = scan.nextInt();
        }

        // printing
        for(int i = 0; i < 5; i++)  // using for loop
        {
            System.out.println("Name: " + name[i] + " Roll: " + roll[i]);
        }

        for(int i : marks)  // using for-each loop
        {
            System.out.println(i);
        }
    }
}