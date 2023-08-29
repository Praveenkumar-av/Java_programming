// Creating StringBuffer objects

class CreateStringBuffer 
{
    public static void main(String[] args) 
    {
        // we can create a StringBuffer object by passing a String to its constructor
        StringBuffer sb = new StringBuffer("Hello!");
        System.out.println(sb);

        // Another way is by alloting memory first and later storing a String in it
        StringBuffer sb1 = new StringBuffer();  // the StringBuffer will create a default size of 16 characters
        sb1.append("Welcome to Java");
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(20);  // the StringBuffer will create a size of 20 characters
        sb2.append("Welcome to Java");

        // The StringBuffer is mutable and can expand dynamically.
    }
}