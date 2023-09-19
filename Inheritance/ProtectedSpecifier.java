// The 'private' members of the super class are not available to the sub class directly.
// For this purpose, we use the 'protected' specifier. 'protected' is used to make the members
// of the super class available to the sub class.

class Access
{
    private int a=10;
    protected int b=20;
}

class Sub extends Access
{
    void get()
    {
        // System.out.println(a);  // Error: a has private access in Access
        System.out.println(b);
    }
}

class ProtectedSpecifier
{
    public static void main(String[] args)
    {
        Sub s = new Sub();
        s.get();
        System.out.println(s.b);
    }
}