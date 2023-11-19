// Vector Class 
// A Vector also stores elements (objects) similar to ArrayList, but Vector is synchronized.

import java.util.*;

class VectorEg
{
    public static void main(String args[])
    {
        Vector<Integer> v = new Vector<>();

        v.add(1);  // appends the element to the end
        System.out.println("4 added :"+v.add(4));  // returns true or false
        v.add(2);
        v.add(3);

        v.add(1,10);  // inserts element at the specified index

        v.set(2,20);  // replaces the first occurence of the specified index

        System.out.println("Contents :"+v);

        System.out.println("contains 10 :"+v.contains(20));  // returns true if arraylist contains the specified element

        System.out.println("2nd index :"+v.get(2));
        
        v.remove(1);  // removes the first occurrence of element or at the specified index

        System.out.println("Contents after removing :"+v);

        System.out.println("Index of 10 :"+v.indexOf(20));  // returns the position of first occurrence of specified element

        System.out.println("Last Index of 10 :"+v.lastIndexOf(20));  // returns the position of last occurrence of specified element
    }
}