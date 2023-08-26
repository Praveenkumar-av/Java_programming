// Bitwise operator acts on the individual bits of the operands.
// & - Bitwise AND
// | - Bitwise OR
// ^ - Bitwise XOR
// ~ - Bitwise Complement
// << - Left Shift
// >> - Right Shift
// >>> - Unsigned Right Shift : converts the sign bit 0

class BitwiseOperator
{
    public static void main(String args[])
    {
        int x = 10, y = 11;

        System.out.println("x & y = " + (x & y));

        System.out.println("x | y = " + (x | y));

        System.out.println("x ^ y = " + (x ^ y));

        System.out.println("~x = " + (~x));

        System.out.println("~x = " + (~y));

        System.out.println("x << 2 = " + (x << 2));

        System.out.println("x >> 2 = " + (x >> 2));

        System.out.println("x >>> 2 = " + (x >>> 2));
    }
}