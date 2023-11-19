// TreeSet class
// TreeSet class implements the Set interface that uses a tree for storage.
// TreeSet class access and retrieval times are quiet fast.
// TreeSet class doesn't allow null element.
// TreeSet class is non synchronized.
// TreeSet class maintains ascending order.
// TreeSet class contains unique elements only like HashSet.

import java.util.*;
class TreeSetEg
{
    public static void main(String args[])
    {
        TreeSet<String> set = new TreeSet<>();

        set.add("B");
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("G");
        set.add("E");

        System.out.println("set :"+set);

        System.out.println("Lowest value :"+set.pollFirst());
        
        System.out.println("Highest value :"+set.pollLast());

        System.out.println("set :"+set);

        System.out.println("Reverse set :"+set.descendingSet());
    }
}