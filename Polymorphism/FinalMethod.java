/* Methods that are declared as 'final' are called final methods. These methods cannot be overridden. 
because they are not available to the sub class. Therefore only method overloading is possible with final methods. */

class A
{
    final void show(int a)
    {
        System.out.println("a :"+a);
    }

    void show(int a,int b)
    {
        System.out.println("a :"+a+"\nb :"+b);
    }
}

class FinalMethod
{
    public static void main(String args[])
    {
        A b = new A();
        b.show(2);
    }
}