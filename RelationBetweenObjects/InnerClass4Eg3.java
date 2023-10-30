// 3. Java Anonymous Inner Class in Method Arguments

class Outer
{
    void show()
    {
        System.out.println("This is inside Outer class");
    }
}

class InnerClass4Eg3
{
    static void display(Outer obj)
    {
        obj.show();
    }

    public static void main(String args[])
    {
        // call and pass the anonymous class object as a argument to a display method
        display(new Outer()
        {
            void show()
            {
                // call 'show' method of parent class using super keyword
                super.show();
                System.out.println("This is inside anonymous class");
            }
        });
    }
}