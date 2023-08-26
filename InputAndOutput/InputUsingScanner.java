// Reading input with java.util.Scanner class

import java.util.Scanner;
class InputUsingScanner
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // next() - reads a single word from the keyboard delimited by a space
        System.out.print("Enter a word :");
        String w = sc.next();
        System.out.println("word :"+w);
        sc.nextLine(); // to clear the buffer

        // nextLine() - reads a single line of text from the keyboard
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("String :"+str);

        // To accept a character 
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        System.out.println("Character :"+ch);

        // nextInt() - reads an integer value from the keyboard
        System.out.print("Enter an integer :");
        int num = sc.nextInt();
        System.out.println("Integer :"+num);

        // nextFloat() - reads a float value from the keyboard
        System.out.print("Enter a float value :");
        float f = sc.nextFloat();
        System.out.println("Float :"+f);

        // nextDouble() - reads a double value from the keyboard
        System.out.print("Enter a double value :");
        double d = sc.nextDouble();
        System.out.println("Double :"+d);

        // nextLong() - reads a long value from the keyboard
        System.out.print("Enter a long value :");
        long l = sc.nextLong();
        System.out.println("Long :"+l);

        // nextShort() - reads a short value from the keyboard
        System.out.print("Enter a short value :");
        short sh = sc.nextShort();
        System.out.println("Short :"+sh);

        // nextByte() - reads a byte value from the keyboard
        System.out.print("Enter a byte value :");
        byte b = sc.nextByte();
        System.out.println("Byte :"+b);

        // nextBoolean() - reads a boolean value from the keyboard
        System.out.print("Enter a boolean value :");
        boolean bool = sc.nextBoolean();
        System.out.println("Boolean :"+bool);
    }
}