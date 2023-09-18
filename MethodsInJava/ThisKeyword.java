// 'This' keyword in Java
// 'This' keyword is a reference variable in Java which refers to the current object.
// Generally, we write instance variables, constructors and instance methods in a class.
// All the members are referenced by 'this' keyword in Java.

class Sample
{
    // x is instance variable
    private int x;
    // default constructor
    Sample()
    {
        this(55);      // call the parameterized constructor
        this.access();  // call the access method
    }

    // parameterized constructor
    Sample(int x)
    {
        this.x = x;
    }

    // instance method
    void access()
    {
        System.out.println("x = "+this.x);
    }
}

class ThisKeyword
{
    public static void main(String args[])
    {
        // creating an object of Sample class
        Sample s = new Sample();  // here default constructor is called
    }
}