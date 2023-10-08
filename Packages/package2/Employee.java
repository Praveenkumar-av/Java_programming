package package2; // creating package

public class Employee
{
    // protected data members
    protected int empId;
    protected String empName;

    public Employee(int empId, String empName)
    {
        this.empId = empId;
        this.empName = empName;
    }

    public void display()
    {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee status : None");
    }
}