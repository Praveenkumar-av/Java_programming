// Accepting input from keyboard using Inputstream

import java.io.*;  // import all classes from java.io package
class InputFromUser
{
    public static void main(String args[]) throws IOException
    {
        // To accept data from keyboard, i.e System.in, we need to connect it to Input Stream
        // InputStreamReader obj = new InputStreamReader(System.in);

        // connect InputStreamReader to BufferedReader, which is another input type of stream
        // BufferdReader br = new BufferedReader(obj);

        // These two steps can be combined into one step as follows:
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Accepting a Single Character from the keyboard
        char ch = (char)br.read();
        System.out.println("Character :"+ch);

        // Accepting a String from the keyboard
        String name = br.readLine();
        System.out.println("Name :"+name);

        // Accepting an Integer from the keyboard
        // First we should accept the integer as a string from keyboard, using readline()
        // String str = br.readLine();
        // Then we should convert the string to integer using parseInt() method of Integer class
        // int a = Integer.parseInt(str);

        int n = Integer.parseInt(br.readLine());
        System.out.println("Integer :"+n);

        // Accepting a Float from the keyboard
        float f = Float.parseFloat(br.readLine());

        // Accepting a Double from the keyboard
        double d = Double.parseDouble(br.readLine());

        // Accepting a Long from the keyboard
        long l = Long.parseLong(br.readLine());

        // Accepting a Short from the keyboard
        short s = Short.parseShort(br.readLine());

        // Accepting a Byte from the keyboard
        byte b = Byte.parseByte(br.readLine());

        // Accepting a Boolean from the keyboard
        boolean bool = Boolean.parseBoolean(br.readLine());

        // To skip a character from the keyboard use br.skip(no_of_characters_to_skip)
    }
}