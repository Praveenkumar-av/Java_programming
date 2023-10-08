class temp
{
    public static void main(String args[])
    {
        int a, b;
        try
        {
            a = 2/1;
        }
        // catch(Exception e){}
        finally
        {
            System.out.println("Exception caught");
        }

        System.out.println("This is after exception");
    }
}