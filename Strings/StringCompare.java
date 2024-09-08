// methods like compareTo() and equals() are used to compare strings

class StringCompare
{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = "Hello";  // has same reference as s1
        String s3 = new String("Hello");  // has different reference

        if(s1 == s2)
            System.out.println("s1 and s2 are equal");
        else
            System.out.println("s1 and s2 are not equal");

        if(s1 == s3)    
            System.out.println("s1 and s3 are equal");
        else
            System.out.println("s1 and s3 are not equal");

        // '==' operator compares the reference of the strings
        // whereas equals() method compares the content of the strings

        if(s1.equals(s3))
            System.out.println("s1 and s3 are equal");
        else
            System.out.println("s1 and s3 are not equal");

        // Compare two strings
        String s4 = "Apple";
        String s5 = "Appla";  // compares the first character that is different using ASCII values
        System.out.println("s4.compareTo(s5): " + s4.compareTo(s5));  // returns 0 if both strings are equal
    }
}