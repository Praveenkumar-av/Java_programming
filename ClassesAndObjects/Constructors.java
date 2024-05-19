/* A constructor is similar to a method that is used to initialize the instance variables.
 * The constructor's name and class name must be the same.
 * A constructor must not have explicit return type.
 * A constructor may or may not have parameters. Parameters are variables to receive data from outside into the constructor.
 * If a constructor does not have any parameters, then it is called a default constructor.
 * If a constructor has 1 or more parameters, then it is called a parameterized constructor.
 * A constructor is called automatically when an object is created. 
 * A constructor is called only once for an object. 
 * Constructor can be overloaded. */

// Initializing the instance variables using a parameterized constructor
class Person
{
    // instance variables
    private String name;
    private int age;

    // default constructor
    Person()
    {
        name = "John";
        age = 24;
    }

    // parameterized constructor
    Person(String s, int a)
    {
        name = s;
        age = a;
    }

    void talk()
    {
        System.out.println("Hello, my name is "+name);
        System.out.println("My age is "+age);
    }
}

class Constructors
{
    public static void main(String args[])
    {
        Person p1 = new Person();   // default constructor is called
        p1.talk();  

        Person p2 = new Person("Raj", 25);  // parameterized constructor is called
        p2.talk();

        // accept name and age through command line arguments
        String s = args[0];
        int a = Integer.parseInt(args[1]);
        Person p3 = new Person(s,a);  // parameterized constructor is called
        p3.talk();
    }
}