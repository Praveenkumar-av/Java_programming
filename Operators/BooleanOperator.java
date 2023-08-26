// These operator act on boolean values and return boolean values.
// & boolean AND operator
// | boolean OR operator
// ! boolean NOT operator

class BooleanOperator
{
    public static void main(String args[])
    {
        boolean a = true, b = false;

        System.out.println("a & b = " + (a & b));

        System.out.println("a | b = " + (a | b));

        System.out.println("!a = " + (!a));

        System.out.println("!b = " + (!b));

        System.out.println("a ^ b = " + (a ^ b));
    }
}