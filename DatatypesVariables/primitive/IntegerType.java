// Integers type data types in Java - long, int, short, byte
// All are signed types, JAVA do not supprt unsigned type

class IntegerType
{
    public static void main(String args[])
    {
        long a = 434358980423L;  // 8 bytes , suffix l or L to denote long type
        System.out.println("a :"+a);

        int b = 234356784;   // 4 bytes
        System.out.println("b :"+b);

        short c = 12334;    // 2 bytes
        System.out.println("c :"+c);

        byte d = 123;   // 1 byte
        System.out.println("d :"+d);

        // other number systems
        a = 0b1001;  // prefix 0b or 0B represents binary number
        System.out.println("binary 1001 :"+a);

        a = 0234;   // prefix 0 represents octal number
        System.out.println("Octal 234 :"+a);

        a = 0XFACE;    // prefix 0x or 0X represents hexadecimal number
        System.out.println("Hexadecimal FACE :"+a);

        // JAVA also supports underscore(_) for easier understanding of integers
        a = 12_234_456;  // underscore is ignored by compiler
        System.out.println("a with underscore :"+a);
    }
}