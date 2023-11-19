// LinkedHashSet Class
// This is a sub class of Hashset class and does not contain any additional members 
// on its own. It internally uses a linked list to store the elements.

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