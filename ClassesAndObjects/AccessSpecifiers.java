/* An access specifier is a keyword that is used to define the scope and visibility of a class, method, or a variable. 
In Java, there are four access specifiers given below.

1. private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
2. public : The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, 
                within the package and outside the package.
3. protected : The access level of a protected modifier is within the package(i.e same directory) and outside the package 
                through child class. If you do not make the child class, it cannot be accessed from outside the package.
4. default : If no access specifier is given, then the default access specifier is used. The scope of the default modifier is 
              within the package only. It cannot be accessed from outside the package. */

class Person
{
    // instance variables
    private String name = "John";
    private int age = 24;

    void talk()
    {
        System.out.println("Hello, my name is "+name);
        System.out.println("My age is "+age);
    }
}

class AccessSpecifiers
{
    public static void main(String args[])
    {
        Person p1 = new Person();
        // p1.name = "Raj"; // error: name has private access in Person
        p1.talk();
    }
}