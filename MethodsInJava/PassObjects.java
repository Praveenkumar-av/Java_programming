/* Even the objects are also passed to methods to java by value. This means, a copy of the object is passed to the method.
So, any changes made to the object inside the method will not be reflected in the original object. */

class Employee
{
    // instance variables
    int id;
    Employee(int id)
    {
        this.id = id;
    }
}

class Check
{
    // to interchange the values of two objects
    void swap(Employee obj1,Employee obj2)
    {
        Employee temp;
        temp = obj1;
        obj1 = obj2;
        obj2 = temp;
    }
}

class PassObjects
{
    public static void main(String args[])
    {
        Employee e1 = new Employee(10);
        Employee e2 = new Employee(20);
        Check c = new Check();
        System.out.println("Before swapping: obj1.id = "+e1.id+" obj2.id = "+e2.id);
        c.swap(e1,e2);
        System.out.println("After swapping: obj1.id = "+e1.id+" obj2.id = "+e2.id);
    }
}