// Abstract class implementing interaface

interface A 
{
    void method1();
}

abstract class B implements A
{
    abstract void method2();
}

class C extends B
{
    public void method1()
    {
        System.out.println("Method 1");
    }

    public void method2()
    {
        System.out.println("Method 2");
    }
}

class Eg4 
{
    public static void main(String args[])
    {
        C c = new C();
        c.method1();
        c.method2();
    }
}