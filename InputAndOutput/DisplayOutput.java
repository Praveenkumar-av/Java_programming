// Output statements in Java
// we use println, print, and printf to display output in the console
// print() method displays the output and retains the cursor in the same line
// println() method displays the output and throws the cursor to the next line
// printf() method displays the output based on the format specifier

class DisplayOutput
{
    public static void main(String args[])
    {
        int x = 10, y = 20;

        // print() method
        System.out.print("Sum of two numbers :"+x+y); // displays 1020 because each variable is treated as a string

        System.out.print("\nSum of two numbers :"+(x+y)); // displays 30 because the expression is evaluated first

        System.out.print("\nSum of two numbers :");
        System.out.print(x+y);

        // println() method
        System.out.println("\nThis is Java Programming");
        System.out.println("This is new line");

        // printf() method
        // The following characters are used in printf() :
        // %d - decimal integer
        // %f - float
        // %c - character
        // %s - string
        // %b, %B - boolean
        // %e, %E - exponential
        // %x, %X - hexadecimal
        // %o - octal
        // %n - new line
        // %% - percent sign
        // %t - date and time

        String s = "Java Programming";
        System.out.printf("String :%s", s);

        int a = 10;
        System.out.printf("%nInteger :%4d", a);

        float f = 10.5f;
        System.out.printf("\nFloat :%.2f", f);

        char ch = 'A';
        System.out.printf("\nCharacter :%c", ch);

        // using String.format() method
        String str = String.format("%nString format method %d :%s",1,s);
        System.out.println(str);
    }
}