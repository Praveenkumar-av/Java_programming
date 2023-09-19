/* Polymorphism in Java
    In Java, a variable, an object or a method can exist in different forms, thus performing different
tasks depending on the context. This is called polymorphism.
    
Polymorphism is of two types:
    1. Compile time or static polymorphism
    2. Runtime or Dynamic polymorphism

1. Compile time polymorphism
    Compile time polymorphism is achieved through method overloading.
2. Runtime polymorphism
    Runtime polymorphism is achieved through method overriding.  */

class Calculate
{
    int multiply(int a, int b)  // method 1
    {
        return (a*b);
    }

    double multiply(double a, double b)  // method 2
    {
        return (a*b);
    }
}

class Polymorphism
{
    public static void main(String args[])
    {
        Calculate c = new Calculate();
        System.out.println(c.multiply(10, 20));     // method 1 is called
        System.out.println(c.multiply(10.5, 20.5)); // method 2 is called
    }
}