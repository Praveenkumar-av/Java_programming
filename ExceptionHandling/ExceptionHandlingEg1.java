/* Exception handling 
step 1 :
    The programmer should observe the code and identify the code which may raise exception. such statements 
should be written inside a try block.
try
{
    statements;
}

step 2 :
    The programmer should write the catch block where he should handle the exception. The catch block should
be written immediately after the try block.
catch(Exception e)
{
    statements;
}

step 3 :
    The programmer should write the finally block where he should write the code which should be executed
whether the exception is raised or not. The finally block should be written immediately after the catch block.
finally
{
    statements;
}
*/
class ExceptionHandlingEg1
{
    public static void main(String args[])
    {
        try
        {
            // open the files
            System.out.println("Open files");

            // do some processing
            int n = args.length;
            System.out.println("n = "+n);
            int a = 10/n;
            System.out.println("a = "+a);
        }
        catch(ArithmeticException ae)
        {
            // display the exception details
            System.out.println(ae);

            // display any message to the user
            System.out.println("Please pass arguments while running this program");
        }
        finally
        {
            // close files
            System.out.println("Close files");
        }
    }
}