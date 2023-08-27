/* do...while loop in Java
This statement is used to execute a block of statements repeatedly until the given condition is true.
The statements inside the block is executed first and then the condition is checked. It runs at least once.
Syntax:
       do
       {
           // Statements to execute
       }
       while (condition);
*/

class DoWhileLoop
{
    public static void main(String args[])
    {
        int x = 1;

        do
        {
            System.out.println("x = " + x);
            x++;    // increment of x
        }while(x <= 10);
    }
}