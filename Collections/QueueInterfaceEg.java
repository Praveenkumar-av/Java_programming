// Queue interface

import java.util.*;

class QueueInterfaceEg
{
    public static void main(String args[])
    {
        // Create a linked list as a queue
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue is :");
        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
}