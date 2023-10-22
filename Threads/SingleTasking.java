// Single tasking using threads.

class MyThread implements Runnable
{
    public void run()
    {
        task1();
        task2();
        task3();
    }

    void task1()
    {
        System.out.println("This is task 1");
    }

    void task2()
    {
        System.out.println("This is task 2");
    }

    void task3()
    {
        System.out.println("This is task 3");
    }
}

class SingleTasking
{
    public static void main(String args[])
    {
        // create an object to MyThread class
        MyThread obj = new MyThread();

        // create a thread t1 and attach it to the object
        Thread t1 = new Thread(obj);

        // execute the thread using run() method
        t1.start();
    }
}