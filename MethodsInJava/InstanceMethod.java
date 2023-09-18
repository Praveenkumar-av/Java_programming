/* Instance methods are methods which act upon the instance variables of the class.
To call the instance method, object is needed.
To call instance method : objectname.methodname();
Instance methods not only access the instance variables but also static variables. 

There are two types of instance methods :
    1. Accessor method
    2. Mutator method

Accessor methods are methods that simply access or read the instance variables. They do not modify the instance variables.

Mutator methods are methods that modify the instance variables. */

class Person
{
    // instance variables
    private String name;
    private int age;

    // mutator methods to store data
    void setName(String name)
    {
        this.name = name;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    // accessor methods to retrieve data
    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }
}

class InstanceMethod
{
    public static void main(String args[])
    {
        // creating an object of Person class
        Person p = new Person();
        // calling the mutator methods
        p.setName("John");
        p.setAge(25);
        // calling the accessor methods
        System.out.println("Name :"+p.getName());
        System.out.println("Age :"+p.getAge());
    }
}