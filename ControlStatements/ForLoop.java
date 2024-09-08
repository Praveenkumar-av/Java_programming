/* The for loop is same as the while loop. The for loop executes a group of 
statements as long as the condition is true.

Syntax:
    for(initialization; condition; increment/decrement)
    {
        //Statements
    }
*/

class ForLoop
{
    public static void main(String args[])
    {
        int i, j;
        for(i=1; i<=10; i++)
        {
            System.out.println(i);
        }

        i = 0;
        for(;;)  // infinite loop
        {
            System.out.println(i);
            i++;
            if(i>5) break;
        }

        // we can use multiple expression in for loop
        for(i=1, j=10; i<=10; i++, j--)
        {
            System.out.println(i + " " + j);
        }
    }
}
