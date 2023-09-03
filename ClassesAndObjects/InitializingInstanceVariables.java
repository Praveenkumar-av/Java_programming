// Program to initialize Instance variables

class Person
{
    // instance variables are initialized here
    String name = "Venkat";
    int age = 30;

    // methods
    void talk()
    {
        System.out.println("Hello I am "+name);
        System.out.println("My age is "+age);        
    }
}

class InitializingInstanceVariables
{
    public static void main(String args[])
    {
        // create Person class object
        Person Raju = new Person();
        //Raju.talk();
        Raju.talk();

        // initialize instance variables using reference here
        Raju.name = "Raju";
        Raju.age = 22;

        Raju.talk();
    }
}