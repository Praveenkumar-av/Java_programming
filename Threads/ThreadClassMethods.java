// Thread class methods 

class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
        int i = 0;
        while(i<5)
        {
            System.out.println("i :"+i++);
        }
    }
}

class ThreadClassMethods
{
    public static void main(String args[])
    {
        // create object of the MyThread
        MyThread obj = new MyThread();

        // Creating Threads 
        Thread t1 = new Thread();   // Thread is created without name
        Thread t2 = new Thread(obj);  // here, obj is target object of the thread
        Thread t3 = new Thread(obj,"Thread-name");  // target object and thread name are given

        // To start a thread 
        t3.start();

        // To know the currently running thread 
        Thread t = Thread.currentThread();
        System.out.println("Current thread :"+t);

        // To stop execution of a thread for a specific time
        try 
        {
            t3.sleep(100);
        } catch(InterruptedException ie) {}

        // To get the name of a thread
        String name = t3.getName();
        System.out.println("Name :"+name);

        // To set a new name to a thread
        t3.setName("new name");

        // To get the priority of a thread
        int priority_no = t3.getPriority();
        System.out.println("Thread priority :"+priority_no);

        // To set the priority of a thread 
        t3.setPriority(10);

        // to test if a thread is still alive 
        boolean b = t3.isAlive();  // returns true or false
        System.out.println("Thread Running :"+b);
        
        // to wait till a thread dies
        try 
        {
            t3.join();
        } catch(InterruptedException ie) {}
    }
}