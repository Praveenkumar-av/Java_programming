// TreeSet class
// All Implemented Interfaces:
//     Serializable, Cloneable, Iterable<E>, Collection<E>, NavigableSet<E>, Set<E>, SortedSet<E> 
// TreeSet class access and retrieval times are quite fast.
// TreeSet class doesn't allow null element.
// TreeSet class is non synchronized.
// TreeSet class maintains ascending order by default.
// TreeSet class contains unique elements only like HashSet.

import java.util.*;
class TreeSetEg
{
    public static void main(String args[])
    {
        TreeSet<String> set = new TreeSet<>();
        // we can also use our own comparator by passing as parameter to constructor

        set.add("B");
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("G");
        set.add("E");
        set.add("F");

        System.out.println("set :"+set);

        System.out.println("Lowest value :"+set.pollFirst());
        
        System.out.println("Highest value :"+set.pollLast());

        System.out.println(set.first());  // returns the first (lowest) element currently in this set.

        System.out.println(set.last());  // returns the last (highest) element currently in this set.
        
        System.out.println(set.contains("E"));

        System.out.println(set.floor("F"));  // returns the greatest element in this set less than or equal to the given element, or null if there is no such element.

        System.out.println(set.ceiling("F"));  // returns the least element in this set greater than or equal to the given element, or null if there is no such element.

        System.out.println(set.lower("F"));  // returns the greatest element in this set strictly less than the given element, or null if there is no such element.

        System.out.println(set.higher("F"));  // returns the least element in this set strictly greater than the given element, or null if there is no such element.

        System.out.println("Reverse set :"+set.descendingSet());

        System.out.println("Head set :"+set.headSet("D"));  // returns a view of the portion of this set whose elements are strictly less than toElement.

        System.out.println("Tail set :"+set.tailSet("D"));  // returns a view of the portion of this set whose elements are greater than or equal to fromElement.

        System.out.println("Head set :"+set.headSet("D", true));  // returns a view of the portion of this set whose elements are strictly less than toElement including toElement.

        System.out.println("Tail set :"+set.tailSet("D", false));  // returns a view of the portion of this set whose elements are greater than or equal to fromElement excluding fromElement.

        System.out.println("Subset :"+set.subSet("B", "G"));  // returns a view of the portion of this set whose elements range from fromElement, to toElement.");

        System.out.println("Subset :"+set.subSet("B", true, "G", true));  // returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, inclusive.");
    }
}