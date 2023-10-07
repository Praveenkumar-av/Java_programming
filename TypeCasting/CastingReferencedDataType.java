// Widening or Upcasting - Converting lower data type into a higher data type;
// Narrowing or Downcasting - Converting higher data type into a lower data type;

class One
{
    void oneMethod()
    {
        System.out.println("One class method");
    }

    void show()
    {
        System.out.println("Super class method");
    }
}

class Two extends One
{
    void twoMethod()
    {
        System.out.println("Two class method");
    }

    void show()  // overriding super class method
    {
        System.out.println("Sub class method");
    }
}

class CastingReferencedDataType
{
    public static void main(String args[])
    {
        // Widening or Upcasting
        One o;  // o is super class reference
        o = (One)new Two();  // o is referring to sub class object, (One) is not mandatory
        o.oneMethod();
        o.show();
        // o.twoMethod();  we can access only the super class object

        // Narrowing or Downcasting
        Two t;  // sub class reference
        // t = (Two)new One();  // t is referring to super class object , none of the super
        // class or sub class objects are accessible  Exception : One cannot be cast to class Two

        t = (Two)o;  // convert sub class reference to super class reference
        t.oneMethod();
        t.twoMethod();
    }
}