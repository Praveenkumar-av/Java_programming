// Thread Priorities
// When the threads are created and started, a 'thread scheduler' program in JVM will load them into
// memory and execute them. This scheduler will not allot more JVM time to those threads which are 
// having higher priorities. The priority numbers of a thread will change from 1 to 10. The minimum
// priority (shown by Thread.MIN_PRIORITY) of a thread is 1, and the maximum priority (Thread.MAX_PRIORITY)
// is 10. The normal priority of a thread (Thread.NORM_PRIORITY) is 5.

class MyThread extends Thread 
{
    int count = 0;
    public void run()
    {
        for(int i=0;i<1000;i++)
            count++;

        System.out.println("Completed thread :"+Thread.currentThread().getName());
        System.out.println("Its Priority :"+Thread.currentThread().getPriority());
    }
}

class ThreadPriorities 
{
    public static void main(String args[])
    {
        MyThread obj = new MyThread();

        Thread t1 = new Thread(obj,"One");
        Thread t2 = new Thread(obj,"Two");

        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);  // this means priority no. : 5

        // start first t1 and then t2
        t1.start();
        t2.start();
    }
}