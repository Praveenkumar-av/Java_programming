// Hash Map class

import java.util.*;

class HashMapEg
{
    public static void main(String args[])
    {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1,"apple");
        hm.put(2,"Banana");
        hm.put(1,"Orange");

        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.values());
    }
}