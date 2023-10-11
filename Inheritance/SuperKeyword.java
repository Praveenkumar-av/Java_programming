/* If we create an object class, we can access only the super class members, but not the sub class members.
But if we create sub class object, all the members of both super and sub classes are available to it.
Sometimes, the super class members and the sub class members have the same name. In that case, by default,
only sub class members are accessible.

Here we can use 'super' keyword to access the super class method and variable  */

class One
{
    // super class variables
    int i = 10;

    // super class method
    void show()
    {
        System.out.println("Super class method i :"+i);
    }
}

class Two extends One
{
    // sub class variables
    int i = 20;

    // sub class method
    void show()
    {
        System.out.println("Sub class method i :"+i);

        // using super to call super class method
        super.show();

        // using super to access super class variable
        System.out.println("Super i :"+super.i);
    }
}

class SuperKeyword
{
    public static void main(String args[])
    {
        // create sub class objects
        Two t = new Two();

        // this will call sub class method only
        t.show();
    }
}