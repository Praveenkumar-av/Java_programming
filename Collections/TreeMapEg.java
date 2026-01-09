// TreeMap 
// TreeMap is a class that implements Map interface and extends HashMap class. 
// It is similar to HashMap but the key difference is that TreeMap maintains 
// ascending order of keys.
// TreeMap uses Red-Black tree based NavigableMap implementation.

import java.util.*;
class TreeMapEg {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "A", 2, "B"));
        
        tm.put(0, "A");

        System.out.println(tm);
    }
}