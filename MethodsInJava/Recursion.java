// A method calling itself is known as 'recursive method' and this phenomenon is known as 'recursion'.

class Factorial
{
    static int findFactorial(int num)
    {
        // to find factorial of a number by recursion
        if(num == 1)
        {
            return 1;
        }
        else
        {
            return num * findFactorial(num-1);
        }
    }
}

class Recursion
{
    public static void main(String args[])
    {
        int num = 5, result;
        result = Factorial.findFactorial(num);
        System.out.println("Factorial of "+num+" is "+result);
    }
}