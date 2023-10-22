// A thread group represents several threads as a single group. 

class ThreadGroup
{
    public static void main(String args[]) throws Exception
    {
        // The following threads are executed by the main thread

        Reservation res = new Reservation();
        Cancellation can = new Cancellation();

        // create a Thread group tg with name
        ThreadGroup tg = new ThreadGroup("First Group");

        // create two groups and add them to First group
        Thread t1 = new Thread(tg,res,"First group");
        Thread t2 = new Thread(tg,res,"Second group");

        // create another Thread group tg1 as a child to tg1
        ThreadGroup tg1 = new ThreadGroup(tg,"Second group");

        // create 2 threads and add them to Second group
        Thread t3 = new Thread(tg1,can,"Third group");
        Thread t4 = new Thread(tg1,can,"Fourth group");

        // find parent group to tg1
        System.out.println("Parent of tg1 :"+tg1.getParent());

        // set maximum priority to tg1 as 7
        tg1.setMaxPriority(7);

        // know the thread group of t1 and t3
        System.out.println("Thread group of t1 :"+t1.getThreadGroup());
        System.out.println("Thread group of t3 :"+t3.getThreadGroup());
    }
}

class Reservation extends Thread 
{
    public void run()
    {
        System.out.println("I am reservation thread");
    }
}

class Cancellation extends Thread 
{
    public void run()
    {
        System.out.println("I am Cancellation thread");
    }
}