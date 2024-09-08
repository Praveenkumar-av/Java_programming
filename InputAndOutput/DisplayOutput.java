// Output statements in Java
// we use println, print, and printf to display output in the console
// print() method displays the output and retains the cursor in the same line
// println() method displays the output and throws the cursor to the next line
// printf() method displays the output based on the format specifier

class DisplayOutput
{
    public static void main(String[] args)
    {
        int x = 10, y = 20;

        // print() method
        // here the arguments are added from left to right, if two numberical values are given, 
        // then they are added and displayed else they are treated as strings and concatenated
        System.out.print(x+y); // displays 30
        System.out.print("Sum of two numbers :"+x+y); // displays 1020 because first string is concatenated with x 
        // and then y is concatenated with the result

        System.out.print("\nSum of two numbers :"+(x+y)); // displays 30 because the expression is evaluated first
        
        System.out.print("\nSum of two numbers :");
        System.out.print(x+y);
        
        // println() method
        System.out.println("\nThis is Java Programming");
        System.out.println("This is new line");
        
        // % [argument_index] [flags] [width] [.precision] [argsize] typechar
        // argument_index : specifies the index of the argument to be used in the format string
        // flags : specifies the output format
            // + : includes a sign (+ or -) with the output
            // - : left-justifies the output
            // 0 : pads the output with zeroes
            // , : includes a comma in the output
            // ( : encloses negative numbers in parentheses
        // width : specifies the minimum number of characters to be written in the output
        // precision : specifies the maximum number of characters to be written in the output
        // argsize : specifies the size of the argument
        // typechar : specifies the type of argument
            // The following are some of the typechar characters used in printf() :
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
            // %h, %H - hash code

        String s = "Java Programming";
        System.out.printf("String :%s", s);

        int a = 10;
        System.out.printf("%nInteger :%4d", a);

        float f = 10.5f;
        System.out.printf("\nFloat :%.2f", f);

        char ch = 'A';
        System.out.printf("\nCharacter :%c", ch);

        // using argument index
        System.out.printf("%nArgument index :%1$d %2$d %1$d", 10, 20);
    
        // using flags
        System.out.printf("%nFlags :%+d %+d", 10, -10);
        System.out.printf("\na is %05d", a);
        System.out.printf("\na is %(5d", -a);

        System.out.printf("\n%10s", "Java");
        System.out.printf("\n%-10s", "Java");

        // using String.format() method
        String str = String.format("%nString format method %d :%s",1,s);
        System.out.println(str);
    }
}