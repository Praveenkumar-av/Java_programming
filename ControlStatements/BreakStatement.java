/* The break statement can be used in 3 ways :
    1. Inside the switch case, to terminate a switch case.
    2. Inside a loop, to terminate the loop.
    3. Inside a labeled statement, to go to end of block of a labeled statement.
*/

class BreakStatement
{
    public static void main(String args[])
    {
        boolean x = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break statement");
                    if(x)
                    {
                        break second;   // break out of second block
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }
    }
}