// The programmer can also create his own exception which are called 'user defined exceptions'.
/* ->The user should create an exception class as a subclass to Exception class. since all exceptions are
subclasses of 'Exception' class.
    Syntax : class MyClass extends Exception

-> The user can write a default constructor in his own exception class in case he does not want to store 
any exception details.
    Syntax : MyException()

-> The user can create a parameterized constructor with a String as a paramete. He can use this to store 
exception details. He can call super class(Exception) constructor from and send the string there.
    MyException(String str)
    {
        super(str);
    }

-> When the user wants to raise his own exception, he should create an object to his exception class and
throw it using throw class, as
    MyException me = new MyException("Exception details");
    throw me; 
*/

class MyException extends Exception
{
    // default constructor 
    MyException()
    {

    }

    // parameterized constructor
    MyException(String str)
    {
        super(str);
    }
}  

class UserDefinedExceptionEg1
{
    public static void main(String args[])
    {
        int a = 1;
        try 
        {
            if(a < 10)
            {
                throw new MyException("a less than 10");
            }
            System.out.println("a is "+a);
        }
        catch(MyException m)
        {
            System.out.println(m);
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}