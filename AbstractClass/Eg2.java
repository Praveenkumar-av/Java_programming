// Abstract class having constructor, static fields and instance variables and methods

abstract class Class1   // abstract class
{
    // instance variables
    int a;

    // static variables 
    static int b;

    // default constructor
    Class1()
    {
        a = 0;
        b = 0;
        System.out.println("Default constructor of class 1");
    }

    // parameterized constructor 
    Class1(int x)
    {
        a = x;
        System.out.println("Parameterized constructor of Class 1");
    }

    // abstract method
    abstract void show();

    // concrete method
    void display()
    {
        System.out.println("a :"+a+", b :"+b);
    }
}

class ConcreteClass extends Class1
{
    // default constructor
    ConcreteClass()
    {
        System.out.println("Default constructor of Concrete class ");
    }

    // parameterized constructor of ConcreteClass
    ConcreteClass(int x)
    {
        super(x);  // pass the value to abstract class constructor
        System.out.println("Parameterized constructor of Concrete class");
    }

    // implementation of show() method
    void show()
    {
        System.out.println("This is abstract method show()");
    }
}

class Eg2
{
    public static void main(String args[])
    {
        ConcreteClass obj1 = new ConcreteClass();
        obj1.display();
        obj1.show();

        ConcreteClass obj2 = new ConcreteClass(10);
        obj2.display();
        obj2.show();
    }
}