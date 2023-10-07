// Inheritance in abstract class
// If we extend a abstract class, the concrete class should implement all the methods of the abstract class.
// Else the sub class must also be a abstract class and it can't be instantiated

abstract class Class1
{
    // abstract method
    abstract void show1();
    abstract void show2();
}

abstract class Class2 extends Class1
{
    // implementing only show1 method
    void show1()
    {
        System.out.println("Abstract method show1()");
    }

    // abstract method
    abstract void show3();

    // This class does not implement all the methods of class1 so it must be abstract class
}

class Class3 extends Class2
{
    // implementation of show1 and show2 methods
    void show2()
    {
        System.out.println("Abstract method show2()");
    }

    void show3()
    {
        System.out.println("Abstract method show3()");
    }
}

class Eg3
{
    public static void main(String args[])
    {
        Class3 obj = new Class3();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}