// Multi tasking using Thread in Java

class MyThread implements Runnable
{
    // declare a string to represent a stack
    String str;

    MyThread(String str)
    {
        this.str = str;
    }

    public void run()
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(str+" :"+i);
            try
            {
                // cease thread execution for 1000 milliseconds
                Thread.sleep(1000);
            }
            catch(InterruptedException ie) 
            {
                ie.printStackTrace();
            }
        }
    }
}

class Multitasking
{
    public static void main(String args[])
    {
        // create two objects to represent two tasks
        MyThread obj1 = new MyThread("Thread 1");
        MyThread obj2 = new MyThread("Thread 2");

        // create two threads and attach them to the objects
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // start the threads
        t1.start();
        t2.start();
    }
}