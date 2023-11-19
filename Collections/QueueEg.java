// Queue Interface 
// Queue follows FIFO(First In First Out) order.

import java.util.*;
class QueueEg
{
    public static void main(String args[])
    {
        // create a linked list as a queue 
        Queue<Integer> q = new LinkedList<>();

        // add() : returns true upon adding element. It throws IllegalStateException if it cannot add
        // element due to insufficient space in the queue. 
        q.add(10);
        q.add(20);

        // offer() : returns true if it adds element and false if it fails.
        q.offer(30);

        // remove() : Delete the beginning element of the queue and returns it. It throws NosuchElementException 
        // if the queue is empty.
        System.out.println(q.remove());

        // poll() : Deletes and returns the first element. It returns null if the queue is empty.
        System.out.println(q.poll());

        // element() : returns the first element. If the queue is empty, then it returns NoSuchElementException.
        System.out.println(q.element());

        // peek() : returns the first element and returns null if the queue is empty.
        System.out.println(q.peek());
    }
}