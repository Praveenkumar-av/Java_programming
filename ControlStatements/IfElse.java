/*  if...else statement in Java :
    This statement is used to perform a task depending on whether the given condition is true or false.
Syntax:
    if (condition)
    {
        // Statements to execute if condition is true
    }
    else if (condition)  // optional
    {
        // Statements to execute if condition is true
    }
    else                 // optional
    {
        // Statements to execute if condition is false
    }
*/

class IfElse
{
    public static void main(String args[])
    {
        int x = 10, y = 14 ;

        // if statement
        if(x < y) System.out.println("x is less than y");

        // if...else statement
        if(x > 0)
        {
            System.out.println("x is positive");
        }
        else 
        {
            System.out.println("x is negative");
        }

        // else if ladder statement
        if(y == 0)
        {
            System.out.println("y is zero");
        }
        else if(y > 0)
        {
            System.out.println("y is positive");
        }
        else
        {
            System.out.println("y is negative");
        }
    }
}