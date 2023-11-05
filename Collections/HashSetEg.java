// Hash set

import java.util.*;
class HashSetEg
{
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("India");
        hs.add("America");
        hs.add("Japan");

        System.out.println("Hash set :"+hs);

        // using iterator
        // add iterator to hs
        Iterator it = hs.iterator();

        System.out.println("Element using iterator :");
        while(it.hasNext())
        {
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}