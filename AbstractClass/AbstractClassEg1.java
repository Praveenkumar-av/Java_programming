// Abstract Method and Abstract class
/* An abstract method does not contain any body. It contains only the method header. So we can it is an
incomplete method. An abstract class is a class that contains some abstract methods. Both the abstract 
class and the abstract methods should be declared by using the keyword 'abstract'. 
    -> An abstract class can have constructors.
    -> It can have abstract methods and concrete methods(methods with body).
    -> It cannot be instantiated.
    -> It can have sratic fields, static methods and final methods.

    If a class extends a abstract class, it should implement all the abstract methods of the base class
    otherwise the sub class must be declared as abstract class.
*/

abstract class myClass
{
    // this is abstract method
    abstract void calculate(double x);
}

class Square extends myClass
{
    // implement the calculate the square value method
    void calculate(double x)
    {
        System.out.println("Square :"+(x*x));
    }
}

class SquareRoot extends myClass
{
    // implement the calculate the square root value method
    void calculate(double x)
    {
        System.out.println("Square root :"+Math.sqrt(x));
    }
}

class AbstractClassEg1
{
    public static void main(String args[])
    {
        double d = 4;
        

        Square s = new Square();
        s.calculate(d);

        myClass r = new SquareRoot();  // using abstract class reference
        r.calculate(d);
    }
}