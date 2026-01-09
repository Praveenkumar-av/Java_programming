// PriorityQueue in Java -> min heap

import java.util.Comparator;
import java.util.PriorityQueue;
class PriorityQueueEg{
    public static void main(String[] args) {
        // elements with lower value will have higher priority by default
        // To change the priority, we can use Comparator interface
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        pq.forEach(x -> System.out.print(x + " "));

        // using custom Priority using Comparator interface
        Comparator<Integer> com = new Comparator<Integer>(){
            // Override compare method using anonymous class
            public int compare(Integer o1, Integer o2){
                if(o1 < o2)
                    return 1;
                else 
                    return -1;
                // return negative value if o1 has higher priority
                // return positive value if o2 has higher priority (swap)
                // return 0 if both have same priority
            }
        };
        PriorityQueue<Integer> nums = new PriorityQueue<>(com);

        nums.offer(2);
        nums.offer(1);
        nums.offer(-1);
        nums.offer(4);

        System.out.print("\nnums :");
        while(!nums.isEmpty())
            System.out.print(nums.poll()+" ");

        // using lambda expression 
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        pq2.offer(100);
        pq2.offer(210);
        pq2.offer(50);
        pq2.offer(300);
        pq2.offer(500);
        pq2.offer(400);
        System.out.print("\npq2 :");
        while(!pq2.isEmpty())
            System.out.print(pq2.poll()+" ");
    }
}