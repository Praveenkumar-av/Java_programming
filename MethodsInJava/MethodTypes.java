/* In Java, there are two types of methods :
    1.Instance methods
    2.Static methods

1.Instance methods :
    Instance methods are methods which act on instance variables of the class. 
To call the method we need to create an object of the class and then call the method 
using the object. Instance methods can access instance variables and instance methods directly. 
Instance methods can access static variables and static methods directly.

2.Static methods :
    Static methods are methods which act on static variables of the class. 
To call the method we need to use the class name and then call the method using the class name. 
Static methods can access static variables and static methods directly. 
Static methods cannot access instance variables and instance methods directly. They need some object 
reference to access them. Static methods can be accessed using the class name or object reference. 
But it is recommended to use the class name to access static methods. 
Static methods cannot use 'this' keyword as there is no instance for this to refer to. */

class Sample
{
    // instance variables
    double num1=3.4, num2=4.5;
    // static variable
    static double num3 = 10.5;

    // instance method
    void display1()
    {
        System.out.println("Inside instance method");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);
    }

    // static method
    static void display2()
    {
        System.out.println("Inside static method");
        // System.out.println("num1 = "+num1); // error
        // System.out.println("num2 = "+num2); // error
        System.out.println("num3 = "+num3);
    }
}

class MethodTypes
{
    public static void main(String args[])
    {
        // creating an object of Sample class
        Sample s = new Sample();
        // calling the instance method
        s.display1();
        // calling the static method
        Sample.display2();   //  or s.display2();
    }
}