// Examples for String class methods

class Eg1
{
    public static void main(String args[])
    {
        String s1 = "A book in Java";
        String s2 = new String("I like it");
        char arr[] = {'H','e','l','l','o','!'};
        String s3 = new String(arr);

        // find the length of the string
        System.out.println("Length of s1: " + s1.length());

        // find the character at a given index
        System.out.println("Character at index 3 in s1: " + s1.charAt(3));

        // concatenate two strings
        System.out.println("Concatenation of s1 and s2: " + s1.concat(s2));

        // concatenate strings with '+'
        System.out.println("Concatenation using + : " + s1 +"From"+ s2);

        // check if two strings are equal
        System.out.println("s1 equals s2: " + s1.equals(s2));

        // check if two strings are equal ignoring case
        System.out.println("s1 equals s2: " + s1.equalsIgnoreCase(s2));

        // check if a string is empty
        System.out.println("s1 is empty: " + s1.isEmpty());

        // check if string starts with "A"
        System.out.println("s1 starts with \"A\": " + s1.startsWith("A"));

        // check if string ends with "Java"
        System.out.println("s1 ends with \"Java\": " + s1.endsWith("Java"));

        // Extract a substring from a string
        System.out.println("Substring of s1: " + s2.substring(2, 6));  // o th character to 6 th character

        // Convert a string to upper case
        System.out.println("Uppercase of s1: " + s1.toUpperCase());

        // Convert a string to lower case
        System.out.println("Lowercase of s1: " + s1.toLowerCase());
    }
}