// Static Inner class

class Outer
{
    // Method of outer class
    void outerMethod()
    {
        System.out.println("Inside Outer method");
    }

    static class Inner 
    {
        void innerMethod()
        {
            System.out.println("Inside Inner method");
        }
    }
}

class InnerClass3
{
    public static void main(String args[])
    {
        // create outer class object
        Outer obj = new Outer();
        obj.outerMethod();

        // create inner class object
        Outer.Inner in = new Outer.Inner();
        in.innerMethod();
    }
}