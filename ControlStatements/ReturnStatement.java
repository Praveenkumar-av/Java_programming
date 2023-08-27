// return statement is used in a method to come out of it to the calling method.

class ReturnStatement
{
    public static void main(String args[])
    {
        // call myMethod() and store the returned value in result
        // since myMethod() is static, we can call it using classname.methodname()
        int result = ReturnStatement.myMethod(10);  
        System.out.println("Result :"+result);
    }

    static int myMethod(int num)
    {
        System.out.println("Before return statement");
        return num*2;   // return statement

        // If return is used inside myMethod(), then the flow of execution comes out of it and goes back to the calling method.
    }
}

