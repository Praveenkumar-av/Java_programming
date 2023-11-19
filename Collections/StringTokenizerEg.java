// StringTokenizer Class
// This class is useful to break a string into pieces, called 'tokens'. This tokens are then stored
// in the StringTokenizer object. 
// syntax : String tokenizer object = new StringTokenizer(string,delimiter)

import java.util.*;
class StringTokenizerEg
{
    public static void main(String args[])
    {
        String str = "This is java programming";

        StringTokenizer st = new StringTokenizer(str); // default delimiter is space
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        str = "Hello,there!,hi";
        st = new StringTokenizer(str,",");  // here, delimiter is comma
        while(st.hasMoreTokens())
            System.out.println(st.nextElement());

        str = "This is java programming";
        st = new StringTokenizer(str," ");  // here, delimiter is space
        System.out.println("Total no. of tokens :"+st.countTokens());    
    }
}