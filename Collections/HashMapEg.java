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

        hm.putIfAbsent(4, "Pine");  // stores key-value pair only if the key is not present in the HashMap else it returns the value of the key.

        hm.merge(4, "apple", (v1, v2) -> v1 +" "+ v2); 
        // If the key is not present in the HashMap, it will store the key-value pair.
        // If the key is present in the HashMap, it will merge the value of the key with the given value.

        System.out.println(hm.get(1));  // returns corresponding value if key is given.

        System.out.println(hm.getOrDefault(6, "Default value"));  // returns the value of the key if present else returns the default value.

        System.out.println(hm.containsKey(1));  // returns true if the key is present in the HashMap.

        System.out.println(hm.containsValue("Banana"));  // returns true if the value is present in the HashMap.

        System.out.println(hm);

        System.out.println(hm.replace(3, "replaced"));  // replaces the value of the key with the new value.

        Set<Integer> keys = hm.keySet();  // returns all the keys of the HashMap into a Set object.
        System.out.println(keys);

        Collection<String> values = hm.values();  // returns all the values of the HashMap into a Collection object.
        System.out.println(values);  

        System.out.println(hm.remove(2));  // removes the key and value from the HashMap.

        System.out.println(hm.size());  // returns the no. of key-value pairs.

        System.out.println(hm.isEmpty());  // returns true if there are no key-value pairs in the HashMap.

        // print all the key-value pairs using lambda expression.
        hm.forEach((k, v) -> System.out.println(k + " " + v));  
    }
}