// throws clause exception
import java.io.*;
class Sample
{
    // instance variable
    private String name;

    // method to accept name
    void accept() throws IOException
    {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name :");
        name = br.readLine();
    }

    // method to display name
    void display()
    {
        System.out.println("Name :"+name);
    }
}

class ThrowsClause
{
    public static void main(String args[]) throws IOException
    {
        Sample s = new Sample();
        s.accept();
        s.display();
    }
}