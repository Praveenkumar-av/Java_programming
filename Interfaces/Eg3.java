// Multiple inheritance in Java
// A single class implementing multiple interfaces

interface Father 
{
    float HT = 6.2f;
    void height();
}

interface Mother 
{
    float HT = 5.8f;
    void height();
}

class Child implements Father, Mother 
{
    public void height() 
    {
        System.out.println("Height of child is: " + (Father.HT + Mother.HT)/2 + " feet");
    }
}

public class Eg3 
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
        obj.height();
    }
}