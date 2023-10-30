class Outer
{
    void show()
    {
        System.out.println("This is inside Outer class");
    }
}

class temp
{
    static void display(Outer obj)
    {
        obj.show();
    }

    public static void main(String args[])
    {
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