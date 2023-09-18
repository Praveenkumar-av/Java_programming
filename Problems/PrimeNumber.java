// Prgram to generate prime number

import java.util.Scanner;
class Primes
{
    static boolean prime(int num)
    {
        // to check if the number is prime or not
        for(int i=2;i<num;i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    static void generate(int max)
    {
        // to generate numbers
        int num=2, count=1;
        while(count <= max)
        {
            if(prime(num))
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}

class PrimeNumber
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no. of prime numbers :");
        int max = scan.nextInt();
        Primes.generate(max);
    }
}