// sub class class extending super class and implementing a interface

class A
{
    void method1()
    {
        System.out.println("Method 1");
    }
}

interface B
{
    void method2();
}

class C extends A implements B
{
    public void method2()
    {
        System.out.println("Method 2");
    }
}

class Eg5
{
    public static void main(String args[])
    {
        C c = new C();
        c.method1();
        c.method2();
    }
}