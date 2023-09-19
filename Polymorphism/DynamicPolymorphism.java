/* Dynamic Polymorphism in Java
    It is also known as runtime polymorphism. It is a process in which a function call to the
overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.

Method overriding :
    Writing methods in both sub class and super class such that the methods hava the same name and same signature 
is called method overriding. */

class Parent 
{
    void print()
    {
        System.out.println("Parent class");
    }
}

class SubClass1 extends Parent
{
    void print()
    {
        System.out.println("Sub class 1");
    }
}

class SubClass2 extends Parent
{
    void print()
    {
        System.out.println("Sub class 2");
    }
}

class DynamicPolymorphism
{
    public static void main(String args[])
    {
        SubClass1 s1 = new SubClass1();
        s1.print();

        SubClass2 s2 = new SubClass2();
        s2.print();
    }
}