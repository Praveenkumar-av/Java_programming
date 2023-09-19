/* The default constructor of the super class is available to the sub class by default. first of all the super class 
default constructor is called and then only the sub class constructor is called.

But the parameterized constructor in the super class is not available to the sub class by default. So it should be
called by using super keyword.  */

class One 
{
    // super class variable 
    int i;

    // super class default constructor 
    One()
    {
        System.out.println("One default");
    }

    // super class parameterized constructor
    One(int i)
    {
        System.out.println("One parameterized");
        this.i = i;
    }
}

class Two extends One
{
    // sub class variable 
    int i;

    // sub class default constructor 
    Two()
    {
        System.out.println("Two default");
    }

    // sub class parameterized constructor
    Two(int a,int b)
    {
        super(a);  // call super class parameterized constructor
        System.out.println("Two parameterized");
        this.i = b;
    }

    void show()
    {
        System.out.println("Sub class i :"+i);
        System.out.println("Super class i :"+super.i);
    }
}

class SuperConstructor
{
    public static void main(String args[])
    {
        // create Two class object with default constructor
        Two t1 = new Two();

        // create Two class object with parameterized constructor
        Two t2 = new Two(10,20);
        t2.show();
    }
}