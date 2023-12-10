// Re-throwing an Exception

class A 
{
    void method1() throws StringIndexOutOfBoundsException
    {
        try
        {
            // take a string with 5 chars
            String s = "hello";

            // the following expression throws exception
            char ch = s.charAt(5);
        }
        catch(StringIndexOutOfBoundsException sie)
        {
            System.out.println("Please see the index is within the range");
            throw sie;
        }
    }
}

class RethrowException
{
    public static void main(String args[])
    {
        A a = new A();
        try
        {
            a.method1();
        }
        catch(StringIndexOutOfBoundsException sie)
        {
            System.out.println("I caught the exception "+sie.getMessage());
        }
    }
}