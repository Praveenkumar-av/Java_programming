// Relating objects of three class
class One
{
    // obj2 is class Two's reference 
    Two obj2;
    // initialize obj2
    One(Two obj)
    {
        this.obj2 = obj;
    }
    double cube(double x)
    {
        // call class Two's method using obj2
        double result = x*obj2.square(x);
        return result;
    }
}

class Two
{
    // obj3 is class Three's reference
    Three obj3;
    // initialize obj3
    Two(Three obj)
    {
        this.obj3 = obj;
    }
    double square(double x)
    {
        // call call Three's method using obj3
        double result = x*obj3.get(x);
        return result;
    }
}

class Three
{
    double get(double x)
    {
        return x;
    }
}

class RelateUsingReferenceEg
{
    public static void main(String args[])
    {
        // create class Three object
        Three obj3 = new Three();
        // create class Two object
        Two obj2 = new Two(obj3);
        // create class One object
        One obj1 = new One(obj2);

        // the preceding statement can be written as 
        // One obj1 = new One(new Two(new Three()));

        double result1 = obj1.cube(5);
        System.out.println("Cube is "+result1);

        double result2 = obj1.obj2.square(6);   // or obj2.square(6);
        System.out.println("Square is "+result2);

        System.out.println(obj1.obj2.obj3.get(3));
    }
}