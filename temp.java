import java.util.Queue;
import java.util.LinkedList;
 
 class temp
 {
    public static void main(String []args)
    {
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{1,2,3});
        q.add(new int[]{10,20,30});

        System.out.println(q.poll()[0]);
        // System.out.println(q.poll()[1]);

        int[] temp = q.poll();
        System.out.println(temp[4]);
    }
 }