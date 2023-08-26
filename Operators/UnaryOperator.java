// Unary operators act on a single operand.
// unary minus opertor : -
// increment operator : ++
// decrement operator : --

class UnaryOperator
{
    public static void main(String args[])
    {
        int a = 10;
        System.out.println("unary minus :" + (-a));  // unary minus operator
        System.out.println("++a = " + ++a);      // pre-increment
        System.out.println("a++ = " + a++);      // post-increment
        System.out.println("a = " + a);
        System.out.println("--a = " + --a);      // pre-decrement
        System.out.println("a-- = " + a--);      // post-decrement
        System.out.println("a = " + a);
    }
}