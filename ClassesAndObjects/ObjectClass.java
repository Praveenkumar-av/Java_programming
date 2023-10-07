// There is a class with the name 'Object' in java.lang package which is the super class of all classes in Java.
// Every class in Java is a direct or indirect sub class of the Object class.

class MyClass
{
    int x;
    MyClass(int x)
    {
        this.x = x;
    }
}

class ObjectClass
{
    public static void main(String args[])
    {
        // create two MyClass objects with same content
        MyClass obj1 = new MyClass(15);
        MyClass obj2 = new MyClass(15);

        // create two wrapper class objects and store same content
        Integer obj3 = new Integer(15);
        Integer obj4 = new Integer(15);

        if(obj1.equals(obj2))
            System.out.println("obj1 and obj2 are equal");
        else
            System.out.println("obj1 and obj2 are not equal");

        if(obj3.equals(obj4))
            System.out.println("obj3 and obj4 are equal");
        else
            System.out.println("obj3 and obj4 are not equal");
    }
}