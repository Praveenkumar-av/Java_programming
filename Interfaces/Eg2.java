// Inheritance in interface

// Define the first interface
interface Interface1 
{
    void method1();
}

// Define the second interface that extends the first interface
interface Interface2 extends Interface1 
{
    void method2();
}

// Implement the second interface in a class
class MyClass implements Interface2 
{
    public void method1() 
    {
        System.out.println("Method 1");
    }
    public void method2() 
    {
        System.out.println("Method 2");
    }
}

// Test the implementation
public class Eg2 
{
    public static void main(String[] args) 
    {
        Interface2 obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
