// Multiple exception handling example

class MultipleExceptionEg1
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
            int b[] = new int[n];
            b[10] = 100;
        }
        catch(ArithmeticException ae)
        {
            // display the exception details
            System.out.println(ae);

            // other statements
            System.out.println("Please pass arguments while running this program");
        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            // display the exception details
            System.out.println(aie);

            // other statements
            System.out.println("Accessing index out of bound");
        }
        catch(Exception e)
        {
            // display the exception details
            System.out.println(e);

            // other statements
            System.out.println("Other exceptions");
        }
        finally
        {
            // close files
            System.out.println("Close files");
        }
    }
}