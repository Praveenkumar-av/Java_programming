// ArrayDeque in java -> double ended queue

import java.util.ArrayDeque;
class ArrayDequeEg{
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(10);
        ad.add(20);
        ad.addFirst(5);
        ad.addLast(30);
        ad.offer(40);
        ad.offerFirst(0);
        ad.offerLast(50);
        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        
        ad.forEach(x -> System.out.print(x + " "));
    }
}