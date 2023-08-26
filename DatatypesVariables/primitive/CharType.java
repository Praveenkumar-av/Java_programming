// The char type is a single 16-bit Unicode character. 
// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

public class CharType 
{
    public static void main(String args[])
    {
        // General characters
        char ch = 'A';
        System.out.println(ch);

        // Special characters
        ch = '@';
        System.out.println(ch);

        // Escape sequences
        ch = '\n';
        System.out.println(ch);

        // Unicode characters
        ch = '\u039A';
        System.out.println(ch);
    }
}
