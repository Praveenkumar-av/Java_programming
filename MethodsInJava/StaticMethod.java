/* A Static method is a method that does not act upon instance variables of a class.
A static variable is declared by using the keyword static. 
To call the static method, class name is needed  : classname.methodname();
Static methods can access only static variables and static methods directly. */

class Sample
{
    // static method
    static void display(int num)
    {
        System.out.println("num :"+num);
    }
}

class StaticMethod
{
    public static void main(String args[])
    {
        // calling the static method
        Sample.display(10);
    }
}