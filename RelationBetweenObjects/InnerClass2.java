// Method local Inner class

class Outer
{
    // Method of outer class
    void outerMethod()
    {
        System.out.println("Inside Outer method");

        // inner class
        class Inner
        {
            void innerMethod()
            {
                System.out.println("Inside Inner method");
            }
        }

        // create inner class object
        Inner n = new Inner();
        // call innerMethod of inner class
        n.innerMethod();
    }
}

class InnerClass2
{
    public static void main(String args[])
    {
        Outer obj = new Outer();
        obj.outerMethod();
    }
}