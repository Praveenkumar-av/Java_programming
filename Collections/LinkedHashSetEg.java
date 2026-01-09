// LinkedHashSet Class
// It is same as hashset but it maintains the order as they are inserted.

import java.util.LinkedHashSet;

class LinkedHashSetEg 
{
    public static void main(String args[])
    {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Apple");
        hs.add("Orange");

        System.out.println("Hash set :"+hs);

        // display using for-each loop 
        System.out.println("Using for-each loop :");
        for(String s : hs)
            System.out.println(s);
    }
}