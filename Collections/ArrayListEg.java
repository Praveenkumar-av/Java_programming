// Array list class
// An arraylist is like an array which can grow in memory dynamically. 
// ArrayList is not synchronized. 

import java.util.*;
class ArrayListEg
{
    public static void main(String args[])
    {
        // create an arrayList
        ArrayList<Integer> arl = new ArrayList<>();

        ArrayList<Integer> arl2 = new ArrayList<>(List.of(30, 40, 50));

        arl.add(1);  // appends the element to the end
        System.out.println("4 added :"+arl.add(4));  // returns true or false
        arl.add(2);
        arl.add(3);

        arl.add(1,10);  // inserts element at the specified index

        arl.addAll(arl2);  // inserts the specified arraylist to the arraylist

        arl.set(2,20);  // replaces the first occurence of the specified index

        System.out.println("Contents :"+arl);

        System.out.println("size :"+arl.size());  // returns the size of the arraylist

        System.out.println("contains 10 :"+arl.contains(20));  // returns true if arraylist contains the specified element

        System.out.println("2nd index :"+arl.get(2));
        
        System.out.println("Index of 10 :"+arl.indexOf(20));  // returns the position of first occurrence of specified element

        System.out.println("Last Index of 10 :"+arl.lastIndexOf(20));  // returns the position of last occurrence of specified element

        System.out.println(arl.remove(1));  // removes the first occurrence of element at the specified index

        System.out.println("Contents after removing :"+arl);

        System.out.println(arl.remove(Integer.valueOf(10)));  // removes the first occurrence of specified element

        arl.removeAll(arl2);  // removes all the elements of the specified arraylist from the arraylist

        System.out.println("Contents after removing :"+arl);

        // retrieving elements using get() method
        System.out.println("Using get() method :");
        for(int i=0; i<arl.size(); i++)
            System.out.print(arl.get(i)+"\t");

        // retrieve elements using for-each loop
        System.out.println("\nUsing for-each loop :");
        for(Integer i : arl)
            System.out.print(i+"\t");
        
        // var can be used in for-each loop
        System.out.println("\nUsing var in for-each loop :");
        for(var i : arl)
            System.out.print(i+"\t");

        // retrieving elements using iterator
        Iterator it = arl.iterator();
        System.out.println("\nUsing iterator :");
        while(it.hasNext())
            System.out.print(it.next()+"\t");

        // retrieve elements using listIterator
        ListIterator lit = arl.listIterator();
        System.out.println("\nUsing listIterator :");
        System.out.println("\nIn forward direction :");
        while(lit.hasNext())
            System.out.print(lit.next()+"\t");

        System.out.println("\nIn backward direction :");
        while(lit.hasPrevious())
            System.out.print(lit.previous()+"\t");

        // retrieve elements using forEach() method
        System.out.println("\nUsing forEach() method :");
        arl.forEach((n) -> System.out.print(n+"\t"));
    }
}