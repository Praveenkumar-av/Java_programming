// Array list class

import java.util.*;
class ArrayListEg
{
    public static void main(String args[])
    {
        ArrayList<Integer> arl = new ArrayList<>();

        arl.add(1);
        arl.add(4);
        arl.add(2);
        arl.add(3);

        System.out.println("Contents :"+arl);
        
        arl.remove(1);

        System.out.println("Contents after removing :"+arl);
    }
}