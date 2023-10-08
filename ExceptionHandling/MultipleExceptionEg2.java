// Multiple exception handling

class MultipleExceptionEg2
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
        catch(ArithmeticException | ArrayIndexOutOfBoundsException obj)
        {
            // display the exception details
            System.out.println(obj);
        }
        finally
        {
            // close files
            System.out.println("Close files");
        }
    }
}