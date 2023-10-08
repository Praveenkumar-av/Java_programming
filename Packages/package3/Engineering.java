package package3; // creating package

import package2.Employee; // importing package2.Employee

public class Engineering extends Employee
{
    public Engineering(int id,String name)
    {
        super(id,name);  // calling constructor of Employee class
    }

    public void display()  // overriding display() method of Employee class
    {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee status : Engineering");
    }
}

// To compile this code we should set the path of the packages in the CLASSPATH environment variable.
// set CLASSPATH=C:\Users\Admin\Documents\Java\packages;.;%CLASSPATH%