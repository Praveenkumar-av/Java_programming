// Floating point types - float, double
// the numbers 23.34 and 10/3 are returned as double by default

class FloatingPointTypes
{
    public static void main(String args[])
    {
        // float - 4 bytes, suffix f or F to denote float type, 6-7 decimal digits
        float a = 123.456f; 
        System.out.println("a :"+a);

        // double - 8 bytes, suffix d or D to denote double type, 15 decimal digits
        double b = 123.456;
        System.out.println("b :"+b);

        // JAVA also supports underscore(_) for user understanding
        a = 12_234_4.52_61f;  // underscore is ignored by compiler
        System.out.println("a with underscore :"+a);

        // scientific notation 
        // 1.234e2 or 1.234e+2 = 1.234 * 10^2
        // 12.34e-2 = 12.34 * 10^-2
        a = 1.234e-2f;  
        System.out.println("a with scientific notation :"+a);

        // float and double can also represent infinity and NaN
        a = 1.0f/0.0f;  // infinity
        System.out.println("a :"+a);

        a = 0.0f/0.0f;  // NaN
        System.out.println("a :"+a);
    }
}