/* There are two types of variables in java:
    1.Instance variables
    2.Static variables

1. Instance variables :
    An instance variable is an variable whose separate copy is available to each object. Instance variables are created 
in the objects on heap memory. Instance variables are also called as non-static variables.

2. Static variables :
    A static variable is a variable whose single copy is available to all objects. Static variables are created in the
class on method area. Static variables are also called as class variables. 

3. Local variable :
    A local variable is a variable which is declared inside a method or a block. Local variables are created in the stack
memory. Local variables are also called as temporary variables. The scope of this variable is within the block. */

class Test
{
    // instance variable
    int num1 = 10;

    // static variable
    static int num2 = 20;

    // instance method
    void display()
    {
        System.out.println("num1 :"+this.num1);
        System.out.println("num2 :"+Test.num2);
    }

    void local(int num)
    {
        int numl = 10;
        // here 'num' and 'numl' are local variable
        // num and numl cannot be accessed outside this method
        System.out.println("\nLocal variable :"+num+" "+numl);  
    }
}

class VariableTypes
{
    public static void main(String args[])
    {
        // creating an object of Test class
        Test t1 = new Test();
        Test t2 = new Test();
        // calling the instance method
        t1.display();
        t2.display();

        System.out.println("\nAfter incrementing the variables of object t1");
        // increment the instance variable of object t1
        t1.num1++;

        // increment the static variable of object t1
        t1.num2++;

        // calling the display method
        t1.display();
        t2.display();

        // calling the local method
        t1.local(10);
    }
}