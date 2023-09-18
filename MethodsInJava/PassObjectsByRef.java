// If we change the instance variables of a object inside the method, the changes will be reflected in the original object.
class Employee
{
    // instance variables
    int id1, id2;
    Employee(int id1,int id2)
    {
        this.id1 = id1;
        this.id2 = id2;
    }
}

class Check
{
    // to interchange the values of two objects
    void swap(Employee obj)
    {
        int temp;
        temp = obj.id1;
        obj.id1 = obj.id2;
        obj.id2 = temp;
    }
}

class PassObjectsByRef
{
    public static void main(String args[])
    {
        Employee e1 = new Employee(10,20);
        Check c = new Check();
        System.out.println("Before swapping: obj1.id1 = "+e1.id1+" obj1.id2 = "+e1.id2);
        c.swap(e1);
        System.out.println("After swapping: obj1.id1 = "+e1.id1+" obj1.id2 = "+e1.id2);
    }
}