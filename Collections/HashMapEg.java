// Hash Map class
// Hash map is a collection that stores element in the form of key-value pairs. Keys should be unique.
// Hash map is not synchronized. 

import java.util.*;

class HashMapEg
{
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"apple");  // stores key-value pair to the HashMap
        hm.put(2,"Banana");
        hm.put(3,"Grapes");
        hm.put(1,"Orange");

        System.out.println(hm.get(1));  // returns corresponding value if key is given.
        System.out.println(hm.get(2));

        System.out.println(hm.keySet());  // converts into a set where only keys will be stored.

        System.out.println(hm.values());  // returns all the values of the HashMap into a Collection object.

        System.out.println(hm.remove(2));  // removes the key and value from the HashMap.

        System.out.println(hm.size());  // returns the no. of key-value pairs.

        System.out.println(hm.isEmpty());  // returns true if there are no key-value pairs in the HashMap.
    }
}