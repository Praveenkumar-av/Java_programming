// obj.notify() : This method releases an object and sends a notification to a waiting thread that the object 
// object is available.
// obj.notifyAll() : This method is useful to send notifications to all waiting threads at once that the object
// is available.
// obj.wait() : This method makes a thread wait for the object till it receives a notification from a notify()
// or notifyAll() methods.

class ThreadCommunication 
{
    public static void main(String args[]) throws Exception
    {
        // Producer produces some data which the Consumer uses it
        Producer obj1 = new Producer();
        // pass the producer object to Consumer to use the data
        Consumer obj2 = new Consumer(obj1);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t2.start();
        t1.start();
    }
}

class Producer extends Thread
{ 
    // to add data, we use string Buffer object
    StringBuffer sb;

    Producer()
    {
        sb = new StringBuffer(); // allot memory
    }

    public void run()
    {
        synchronized(sb)
        {
            // go to appending data(members) to string buffer
            for(int i=0;i<10;i++)
            {
                try
                {
                    sb.append(i+":");
                    Thread.sleep(100);
                    System.out.println("appending");
                }
                catch(InterruptedException ie) {}
            }
            sb.notify(); // data production is over, so notify to consumer thread
        }
    }
}

class Consumer extends Thread
{
    Producer prod; // create Producer class reference 

    Consumer(Producer prod)
    {
        this.prod = prod;
    }

    public void run()
    {
        synchronized(prod.sb)
        {
            // wait till a notification is received from the Producer thread
            try
            {
                prod.sb.wait();
            }catch(InterruptedException ie) {}

            // when production is over display the results
            System.out.println("Result :"+prod.sb);
        }
    }
}