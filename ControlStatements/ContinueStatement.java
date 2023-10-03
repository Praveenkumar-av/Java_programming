/* continue is used in 2 ways :
    1. Inside the loop, to continue with the next iteration of the loop.
    2. Inside a labeled statement, to continue with the next iteration of the labeled statement.
*/

class ContinueStatement
{
    public static void main(String args[])
    {
        // continue inside a loop
        int i;
        for(i=10;i>0;i--)
        {
            if(i>5)
            {
                continue;   // skip the rest of the statements
            }
            System.out.println(i);
        }

        // labeled continue statement
        int j;
        outer: for(i=0;i<3;i++)
        {
            System.out.println("i :"+i);
            j = 0;
            inner: while(j<5)
            {
                if(j == 2)
                {

                    continue outer;
                }
                System.out.println("\tj :"+j);
                j++;
            }
        }
    }
}