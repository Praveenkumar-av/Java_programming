// Let us take a string and copy some of the characters into a character array.

class Eg2
{
    public static void main(String args[])
    {
        String s1 = "A book in Java";
        char arr[] = new char[5];

        // copy characters from s1 to arr
        s1.getChars(2, 7, arr, 0);

        // print the characters in arr
        System.out.println("Characters in arr: ");
        System.out.println(arr);
    }
}