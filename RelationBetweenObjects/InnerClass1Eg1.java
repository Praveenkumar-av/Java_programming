// Nested Inner Class

class Outer 
{
    class Inner
    {
        int num;
        Inner(int num)
        {
            this.num = num;
        }
        void display()
        {
            System.out.println("This is Inner class "+num);
        }
    }

    // This is outer class display
    void display()
    {
        System.out.println("This is Outer class");
        // create inner class object here
        Inner d = new Inner(10);
        d.display();
    }
}

class InnerClass1Eg1
{
    public static void main(String args[])
    {
        // create inner class object directly
        Outer.Inner obj1 = new Outer().new Inner(5);
        obj1.display();

        // create inner class object by outer class object
        Outer obj = new Outer();
        obj.display();
        Outer.Inner obj2 = obj.new Inner(20);
        obj2.display();
    }
}