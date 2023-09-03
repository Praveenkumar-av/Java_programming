/* When an object is created, memory is allocated on 'heap'. After creation of an object, JVM produces a unique
 reference number for the object from the memory address of the object. This reference number is also called
 'hashcode' of the object. This hashcode is used to access the object from the memory. */

class Person
{
    // Instance variables
    String name;
    int age;

    // Methods
    void speak()
    {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}

class CreateObject
{
    public static void main(String[] args)
    {
        // Create an object of class Person
        Person Raju = new Person();  // Raju is a reference variable which holds the hashcode of the object

        // find the hash code of object 
        System.out.println(Raju.hashCode());

        // call the speak() method
        Raju.speak();  // My name is null, My age is 0
        // We created an object 'Raju' but did not initialize the instance variables. So, JVM stores null into name, 0 into age
        // 0 for int, 0.0 for double, false for boolean, \u0000 for char, null for String and any class type.
    }
}