// StringBuffer methods in Java

class StringBufferMethods
{
    public static void main(String args[])
    {
        // create an object of StringBuffer
        StringBuffer sb = new StringBuffer("Uni");
        System.out.println(sb);

        // StringBuffer capacity() : returns the current capacity of the StringBuffer
        System.out.println(sb.capacity());

        // StringBuffer ensureCapacity(int minCapacity) : increases the capacity of the StringBuffer to minCapacity
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        // StringBuffer charAt(int index) : returns the character at the specified index
        System.out.println(sb.charAt(2));

        // StringBuffer append(x) : x may be boolean, byte, int, long, float, double, char, String, or another StringBuffer object
        sb.append("versity");
        System.out.println(sb);

        // StringBuffer insert(int index, x) : x may be of any type. It will be inserted into the StringBuffer at the specified index
        sb.insert(3, "hi");
        System.out.println(sb);

        // StringBuffer delete(int start, int end) : deletes the characters from start to end-1
        sb.delete(3, 5);
        System.out.println(sb);

        // StringBuffer reverse() : reverses the StringBuffer
        StringBuffer temp = new StringBuffer(sb);
        System.out.println(temp.reverse());

        // String toString() : converts the StringBuffer to String
        String s = sb.toString();
        System.out.println(s);

        // int length() : returns the length of the StringBuffer
        System.out.println(sb.length());

        // int indexOf(String str) : returns the index of the first occurrence of the substring str or -1 if not found
        System.out.println(sb.indexOf("sity"));

        // int lastIndexOf(String str) : returns the index of the last occurrence of the substring str or -1 if not found
        System.out.println(sb.lastIndexOf("i"));

        // StringBuffer replace(int start, int end, String str) : replaces the characters from start to end-1 with the String str
        sb.replace(9, 10, "ies");
        System.out.println(sb);

        // StringBuffer substring(int i) : returns the substring from start to the end of the StringBuffer
        s = sb.substring(3);
        System.out.println(s);

        // StringBuffer substring(int start, int end) : returns the substring from start to end-1
        s = sb.substring(3, 6);
        System.out.println(s);
        
        // StringBuffer delete(int start, int end) : deletes the characters from start to end-1
        sb.delete(2,4);
        System.out.println(sb);

        // StringBuffer deleteCharAt(int index) : deletes the character at the specified index
        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}