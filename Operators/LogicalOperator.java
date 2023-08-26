// Logical operator are used to combine two or more relational expressions
// && - Logical AND
// || - Logical OR
// !  - Logical NOT

class LogicalOperator
{
    public static void main(String args[])
    {
        int a = 10, b = 10, c = 30;

        if(a == 10 && b == 10)
        System.out.println("a and b are equal");

        if(a == 10 || b == 10  || c == 10)
        System.out.println("Any one is 10");

        if(!(c == 10))
        System.out.println("c is not equal to 10");
    }
}