// Ternary Operator (?:) acts on three variables
// Syntax: variable = (expression) ? value if true : value if false
// This other name is conditional operator.

class TernaryOperator
{
    public static void main(String args[])
    {
        int a = 10, b = 20, result;

        result = (a > b) ? a : b;

        System.out.println("Larger number = " + result);
    }
}