// Inheritance in Java exanple

class Parent
{
    // instance variables
    int a;

    // instance methods
    void display1()
    {
        System.out.println("Inside Parent class");
    }
}

class Child extends Parent
{
    // instance variables
    int b;

    // instance methods
    void display2()
    {
        System.out.println("Inside Child class a :"+a+" b :"+b);
    }
}

class InheritanceEg1
{
    public static void main(String args[])
    {
        // Child class object
        Child c = new Child();
        c.a = 20;
        c.b = 30;
        c.display1();
        c.display2();
    }
}