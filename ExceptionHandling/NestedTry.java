// Nested try block in Exception Handling

class NestedTry
{
    public static void main(String args[])
    {
        try
        {
            try
            {
                int a = 10/0;
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Exception :"+ae.getMessage());
            }
            try 
            {
                int a[] = new int[5];
                a[5] = 4;
            }
            catch(ArrayIndexOutOfBoundsException aio)
            {
                aio.printStackTrace();
            }
        }
        catch(Exception e)
        {
            System.out.println("Other exceptions :"+e);
        }
        finally 
        {
            System.out.println("End of program");
        }
    }
}