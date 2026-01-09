// LinkedHashMap
// It maintains the insertion order using doubly linked list

import java.util.*;
class LinkedHashMapEg {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "A");
        lhm.put(3, "C");
        lhm.put(2, "B");

        lhm.forEach((k, v)->System.out.println(k+" "+v));

        // we can set the order as least recently used order
        LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(5, 0.75f, true);
        lhm2.put(1, "A");
        lhm2.put(3, "C");
        lhm2.put(2, "B");

        System.out.println(lhm2);
        // access the values to change the order
        lhm2.get(2);
        lhm2.get(1);
        System.out.println(lhm2);

        // we can limit the no. of elements stored in the hashmap to use it as cache
        LinkedHashMap<Integer, String> lhm3 = new LinkedHashMap<>(5, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 3;
            }
        };

        lhm3.put(1, "A");
        lhm3.put(2, "B");
        lhm3.put(3, "C");
        lhm3.put(4, "D");
        lhm3.get(2);
        System.out.println(lhm3);
    }
}