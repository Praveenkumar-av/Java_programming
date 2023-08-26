// Integers type data types in Java - long, int, short, byte

import java.io.*;
class temp
{
    public static void main(String args[])
    {
        int x = 10, y = 14;

        System.out.println("x & y = " + (x & y));

        System.out.println("x | y = " + (x | y));

        System.out.println("x ^ y = " + (x ^ y));

        System.out.println("~x = " + (~x));
        System.out.println("~x = " + (~y));

        System.out.println("x << 2 = " + (x << 2));

        System.out.println("x >> 2 = " + (x >> 2));

        System.out.println("x >>> 2 = " + ((-x) >>> 2));
    }
}