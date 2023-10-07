/* It is possible to convert one primitive data type into another data type. This is done in two ways, 
  widening and narrowing. 
->Widening is converting a lower data type into a higher data type.
->Narrowing is converting a higher data type into a lower data type.
->Widening is done automatically by the compiler, but narrowing must be done manually.
->Order of data types from lower to higher is as follows: 
    byte, short, char, int, long, float, double  */

class CastingPrimitiveDataType
{
    public static void main(String args[])
    {
        // Widening
        char ch = 'A';
        int num = (int)ch;
        System.out.println("ASCII value of " + ch + " is " + num);

        int x = 9500;
        float sal = (int)x;
        System.out.println("Sal :"+sal);

        // widening is safe because there will not be any loss of data or precision. Java does the casting 
        // internally and hence this is also called 'implicit casting'.

        ch = 'B';
        num = ch;
        System.out.println("ASCII value of " + ch + " is " + num);

        x = 10000;
        sal = x;
        System.out.println("Sal :"+sal);

        // Narrowing
        // Since Narrowing is not safe, so the programmer compulsory cast the data type explicitly.

        int n = 97;
        ch = (char)n;
        System.out.println("char is "+ch);

        double d = 10.23;
        int num2 = (int)d;
        System.out.println("Number is "+num2);
    }
}