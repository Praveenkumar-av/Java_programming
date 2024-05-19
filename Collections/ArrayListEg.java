// Array list class
// An arraylist is like an array which can grow in memory dynamically. 
// ArrayList is not synchronized. 

import java.util.*;
class ArrayListEg
{
    public static void main(String args[])
    {
        ArrayList<Integer> arl = new ArrayList<>();

        arl.add(1);  // appends the element to the end
        System.out.println("4 added :"+arl.add(4));  // returns true or false
        arl.add(2);
        arl.add(3);

        arl.add(1,10);  // inserts element at the specified index

        arl.set(2,20);  // replaces the first occurence of the specified index

        System.out.println("Contents :"+arl);

        System.out.println("contains 10 :"+arl.contains(20));  // returns true if arraylist contains the specified element

        System.out.println("2nd index :"+arl.get(2));
        
        System.out.println(arl.remove(1));  // removes the first occurrence of element or at the specified index

        System.out.println("Contents after removing :"+arl);

        System.out.println("Index of 10 :"+arl.indexOf(20));  // returns the position of first occurrence of specified element

        System.out.println("Last Index of 10 :"+arl.lastIndexOf(20));  // returns the position of last occurrence of specified element

        // retrieve using listIterator
        System.out.println("Vector element :");
        ListIterator lit = arl.listIterator();

        System.out.println("In forward direction :");
        while(lit.hasNext())
            System.out.print(lit.next()+"\t");

        System.out.println("\nIn backward direction :");
        while(lit.hasPrevious())
            System.out.print(lit.previous()+"\t");
    }
}