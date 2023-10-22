// Thread Synchronization
/* When a Thread is already acting on a object, preventing any other thread from acting on the same object 
is called 'Thread Synchronization' or 'Thread safe'. The object on which the Threads are synchronized is
called 'synchronized object'. This Thread is recommended when multiple threads are acting on the same object. */

class Reserve implements Runnable
{
    // available berth is 1
    int available = 1;
    int wanted;

    // accept wnated berths at run time
    Reserve(int i)
    {
        wanted = i;
    }

    public void run()
    {
        // synchronized Block
        synchronized(this) 
        {
            // display the available berths
            System.out.println("Available berths :"+available);

            if(available >= wanted)
            {
                // get the name of the passenger
                String name = Thread.currentThread().getName();
                // allot the berth to him
                System.out.println(wanted+" berth reserved for "+name);
                try
                {
                    Thread.sleep(1000);
                    available -= wanted;
                }
                catch(InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
            else
            {
                System.out.println("Sorry! no berths available");
            }
        }
    }
}

class SynchronizedBlock
{
    public static void main(String args[])
    {
        Reserve obj = new Reserve(1);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First Person");
        t2.setName("Second Person");

        t1.start();
        t2.start();
    }
}