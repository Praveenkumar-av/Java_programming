// creating a file using BufferedOutputStream 
// Buffered class is used to improving the speed of reading and writing operation.

import java.io.*;
class BufferedOutputStreamEg
{
    public static void main(String args[]) throws IOException
    {
        // attach keyboard to DataInputStream
        DataInputStream dis = new DataInputStream(System.in);

        // attach file to FileOutputStream
        FileOutputStream fout = new FileOutputStream("file2.txt");

        // attach FileOutputStream to BufferedOutputStream 
        BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
        // here the buffer size is 1024 bytes, default size is 512 bytes.

        // writing the text read from user
        char ch;
        System.out.println("Enter text (@ at the end) :");
        // read characters from dis into ch. Then write then into bout.
        // repeat this as long as the read character is not @
        while((ch = (char)dis.read()) != '@')
            bout.write(ch);

        // close the file
        bout.close();
    }
}