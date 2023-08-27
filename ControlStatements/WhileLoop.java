/* while loop in Java
This statement is used to execute a block of statements repeatedly until the given condition is true.
The condition is checked first and then the statements inside the block is executed.
Syntax:
       while (condition)
       {
           // Statements to execute
       }
*/

class WhileLoop
{
    public static void main(String args[])
    {
        int x = 1;

        while(x <= 10)
        {
            System.out.println("x : " + x);
            x++;    // increment of x
        }
    }
}