// Anonymous Inner Class 
// 2. Anonymous Inner class that implements a interface

interface MyInterface 
{
    void display();
}

public class InnerClass4Eg2 
{
    public static void main(String[] args) 
    {
        // Create an instance of the interface using an anonymous inner class
        MyInterface obj = new MyInterface() 
        {
            public void display() 
            {
                System.out.println("in anonymous inner class");
            }
        };
        
        // Call the method on the interface instance
        obj.display();
    }
}
