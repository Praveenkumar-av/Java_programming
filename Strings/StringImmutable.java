// Immutable objects are those objects whose content can not be changed once created.
// String objects are immutable. Once created, we can not change the content of the string object.
// If we try to change the content of the string object, a new object will be created in the heap memory.

class StringImmutable
{
    public static void main(String args[])
    {
        String s1 = "data";
        String s2 = "base";

        s1 = s1 + s2;  // join two strings
        System.out.println(s1);
        System.out.println(s2);

        /* In the above example, we are trying to change the content of the string object s1. JVM creates a new
        object and stores the string 'database' in it. After creating the new object, the reference of s1 is
        changed to the new object. The old object has lost reference and is eligible for garbage collection. */
    }
}