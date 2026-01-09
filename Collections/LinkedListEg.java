// LinkedList Class - java uses doubly linked list
// A linked list contains a group of elements in the form of nodes. Each node will have three fiels -
// the data field contains data and the link fields contain references to previous and next nodes. 

import java.util.LinkedList;
class LinkedListEg 
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        // all the methods of ArrayList are available in linkedlist
        // In addition, linkedlist has some extra methods like addFirst, addLast, removeFirst, removeLast, getFirst, getLast, etc.
        ll.add("element1");
        ll.offer("element2");
        ll.addFirst("element3");
        ll.addLast("element4");
        ll.offerFirst("element5");
        ll.offerLast("element6");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        
        ll.forEach(x -> System.out.println(x));
    }
}