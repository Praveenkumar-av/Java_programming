// Hash set
// The set will not allow duplicate data. Also the set will not maintain 
// the same order of elements as in which they were entered.

import java.util.*;
class HashSetEg
{
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("India");
        hs.add("America");
        hs.add("Japan");
        hs.add("America");

        System.out.println("Hash set :"+hs);

        // display element by element using iterator
        // add iterator to hs
        Iterator it = hs.iterator();

        System.out.println("Element using iterator :");
        while(it.hasNext())
        {
            String s = (String)it.next();
            System.out.println(s);
        }

        hs.remove("Japan");

        System.out.println("Hash set :"+hs);

        System.out.println("Contains Japan :"+hs.contains("Japan"));  // returns true or false

        System.out.println("size :"+hs.size());  // returns no. of objects as integer
    }
}