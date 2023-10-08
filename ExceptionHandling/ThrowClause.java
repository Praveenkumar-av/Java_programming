// Throw statement is available in Java to throw an exception explicitly and catch it.
// Syntax : throw new NullPointerException("Exception data");

class Sample
{
    static void demo()
    {
        try 
        {
            System.out.println("Inside demo()");
            throw new NullPointerException("Exception data");
        }
        catch(NullPointerException n)
        {
            System.out.println(n);
        }
    }
}

class ThrowClause
{
    public static void main(String args[])
    {
        Sample.demo();
    }
}