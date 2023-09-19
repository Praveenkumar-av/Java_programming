// Program to inherit Teacher class and implement its members

class Teacher
{
    // instance variables
    int id;
    String name;
    float salary;

    // setter method to store id 
    void setId(int id)
    {
        this.id = id;
    }

    // getter method to retrieve id
    int getId()
    {
        return id;
    }

    // to store name
    void setName(String name)
    {
        this.name = name;
    }

    // to retrieve name
    String getName()
    {
        return name;
    }

    // to store salary
    void setSalary(float salary)
    {
        this.salary = salary;
    }

    // to retrieve salary
    float getsalary()
    {
        return salary;
    }
}

class Student extends Teacher  // Student class inherits Teacher class
{
    // since id, name, and salary are already available from Teacher class, we omit

    // instance variables of Student class
    float marks;

    // to set marks
    void setMarks(float marks)
    {
        this.marks = marks;
    }

    // to retrieve marks
    float getMarks()
    {
        return marks;
    }
}

class InheritanceEg2
{
    public static void main(String args[])
    {
        // Teacher class object
        Teacher t = new Teacher();
        t.setId(2001);
        t.setName("Teacher1");
        t.setSalary(15000f);

        System.out.println("Id :"+t.getId());
        System.out.println("Name :"+t.getName());
        System.out.println("Salary :"+t.getsalary());

        // Student class object
        Student s = new Student();
        s.setId(1001);
        s.setName("Student1");
        s.setMarks(455f);

        System.out.println("Id :"+s.getId());
        System.out.println("Name :"+s.getName());
        System.out.println("Marks :"+s.getMarks());
    }
}