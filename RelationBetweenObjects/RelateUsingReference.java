// Program that take class One and Two, and create reference of class Two in class One. 

// relating class two with class One
class One
{
    // instance variables
    int x;
    Two t;
    // constructor that receives Two's class reference
    One(Two obj)
    {
        // copy Two's reference into instance variable t
        this.t = obj;
        x = 10;
    }
    // method to display class One and class Two vars
    void display()
    {
        System.out.println("One's x :"+x);
        // call class Two's method
        System.out.println("Two's var :"+t.y);
    }
}

class Two
{
    // instance variables
    int y;
    Two(int y)
    {
        this.y = y;
    }
    // method to display y
    void display()
    {
        System.out.println("Two's y :"+y);
    }
}

class RelateUsingReference
{
    public static void main(String args[])
    {
        // create object of class Two
        Two obj2 = new Two(20);
        // create object of class One and pass Two's object
        One obj1 = new One(obj2);
        // call class One's method
        obj1.display();
        // call class Two's method
        obj2.display();
        // access Two's y
        System.out.println("Two's y from main :"+obj1.t.y);
        // change Two's y
        obj1.t.y = 100;
        obj2.display();
    }
}