// There are three ways to create a string in Java.

class CreateString
{
    public static void main(String args[])
    {
        // we can create a strings by assigning a group of characters to a String type variable
        String str1 = "Hello World";
        System.out.println(str1);

        // we can create a string by using the new keyword
        String str2 = new String("Hello World");
        System.out.println(str2);

        // we can create a string by passing array name to the String constructor
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str3 = new String(charArray);
        System.out.println(str3);

        String str4 = "Hello World";
        System.out.println(str4);

        System.out.println("Reference of str1 :"+ System.identityHashCode(str1));  // str1 and str4 are pointing to the same object
        System.out.println("Reference of str2 :"+ System.identityHashCode(str2));
        System.out.println("Reference of str4 :"+ System.identityHashCode(str4));
    
        /* If we assign an object using the new keyword, then a new object will be created in the heap memory.
        If we assign an object using '=', JVM searches in the string constant pool for the string with same content,
        if it is already available, it simply creates another reference variable. here both str1 and str4 are pointing to the same object. */
    }
}