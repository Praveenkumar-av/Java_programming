// StreamTokenizer

import java.io.*;
import java.util.ArrayList;

class StreamTokenizerEg
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream("file4.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
            return;
        }

        ArrayList<String> arl1 = new ArrayList<>();
        ArrayList<Double> arl2 = new ArrayList<>();
        int wordCount=0, charCount=0, lineCount=0, numberCount=0;
        
        StreamTokenizer input = new StreamTokenizer(fis);
        int tok;
        while((tok = input.nextToken()) != StreamTokenizer.TT_EOF)
        {
            if(tok == StreamTokenizer.TT_EOL)
            {
                lineCount++;
            }
            else if(tok == StreamTokenizer.TT_WORD)
            {
                arl1.add(input.sval);
                wordCount++;
                charCount += input.sval.length();
            }
            else if(tok == StreamTokenizer.TT_NUMBER)
            {
                arl2.add(input.nval);
                numberCount++;
            }
        }

        System.out.println("Words :");
        for(String s : arl1)
            System.out.print(s+" ");

        System.out.println("\nNumbers :");
        for(Double f : arl2)
            System.out.print(f+" ");

        System.out.println("\nWords count :"+wordCount);
        System.out.println("Characters count :"+charCount);
        System.out.println("Numbers count :"+numberCount);
        System.out.println("Lines count :"+lineCount);

        fis.close();
    }
}