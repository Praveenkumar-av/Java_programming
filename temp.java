class BookTicket implements Runnable
{
    Object train, comp;

    BookTicket(Object train,Object comp)
    {
        this.train = train;
        this.comp = comp;
    }

    public void run()
    {
        synchronized(train)
        {
            System.out.println("Bookticket locked on train");
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie) {}

            System.out.println("Book ticket now waiting to lock on compartment");
        
            synchronized(comp)
            {
                System.out.println("Bookticket locked on compartment ");
            }
        }
    }
}

class CancelTicket implements Runnable
{
    Object train, comp;

    CancelTicket(Object train,Object comp)
    {
        this.train = train;
        this.comp = comp;
    }

    public void run()
    {
        synchronized(train)
        {
            System.out.println("Cancel ticket locked on train");
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie) {}

            System.out.println("Cancel ticket now waiting to lock on compartment");

            synchronized(comp)
            {
                System.out.println("Bookticket locked on compartment ");
            }
        }
    }
}

class temp
{
    public static void main(String args[])
    {
        Object train = new Object();   
        Object comp = new Object();  

        BookTicket obj1  = new BookTicket(train,comp);
        CancelTicket obj2  = new CancelTicket(train,comp);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
