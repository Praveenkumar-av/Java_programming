// Interfaces in Java
/* An interface contains only abstract methods which are all incomplete methods. 
   We can create separate classes which implements all the methods of the interface. These classes are
   called implementation classes. 
-> An interface will have 0 or more abstract classes which are all public and abstract by default.
-> An interface will have 0 or more static variables which are all public, static and final by default.
-> We cannot create an object for an interface, but we can create a reference of interface type.
-> An interface can extend any number of interfaces at a time.
-> An interface cannot extend any class.
-> An interface cannot implement any interface or class.
-> An interface can be implemented by any number of classes at a time.
-> It is possible to write a class within an interface.
-> It is possible to write an interface within a class. */

interface Sample
{
    int NUM = 20;  // public static final int NUM = 10; by default
    void method1();  // public abstract void method1(); by default
}

class Class1 implements Sample
{
    // implementing the abstract method of the interface
    public void method1()
    {
        System.out.println("Method1");
    }
}

class InterfaceEg1
{
    public static void main(String args[])
    {
        Class1 obj = new Class1();
        obj.method1();
        System.out.println("NUM = " + obj.NUM);
    }
}