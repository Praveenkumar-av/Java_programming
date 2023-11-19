// Arrays class
// Arrays class provides methods to perform certain operations on any one dimensional 
// array. All the methods of Array class are static. 

import java.util.*;

class ArraysClass
{
    public static void main(String args[])
    {
        int arr[] = {19,23,10,7,78};

        System.out.print("Array :");
        for(int a : arr)
            System.out.print(a+" ");

        //sort(array,int start, int end) : sorts the array form start to end in ascending order
        Arrays.sort(arr);  
        System.out.print("\nArray after sorting :");
        for(int a : arr)
            System.out.print(a+" ");

        System.out.print("\nEnter the element to search :");
        Scanner scan = new Scanner(System.in);
        int element = scan.nextInt();
        // binarySearch(arr,element) : searches for an element in the array and returns the index
        // if element is not found, it returns a negative value.
        int index = Arrays.binarySearch(arr,element);  // 
        if(index < 0) 
            System.out.println("Element not found");
        else 
            System.out.println("Element found at index :"+index);

        // fill(array,value) : fills the array with the specified value
        Arrays.fill(arr,1);
        System.out.print("Array after filling with 1:");
        for(int a : arr)
            System.out.print(a+" ");
    }
}