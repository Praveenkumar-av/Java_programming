// Creating thread
// to create a thread, a class should extend Thread class or implement Runnable interface
// Thread class provides constructors and methods to create and perform operations on a thread

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}

class CreatingThread
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread();
        t1.start();
    }
}