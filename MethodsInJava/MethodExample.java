// Methods example in java 

class Sample
{
    // instance variables
    private double num1, num2;
    // parameterized constructor
    Sample(double x,double y)
    {
        num1 = x;
        num2 = y;
    }

    void sum1()
    {
        // instance method to find the sum of x and y
        // This method does not accept any parameters and does not return any value
        double res = num1 + num2;
        System.out.println("sum of method 1 is: "+res);
    }

    double sum2()
    {
        // This method does not accept any parameters but returns a value
        double res = num1 + num2;
        return res;   
    }

    double sum3(double x,double y)
    {
        // This method accepts two parameters and returns a value
        double res = x + y;
        return res;
    }
}

class MethodExample
{
    public static void main(String args[])
    {
        // creating an object of Sample class
        Sample s = new Sample(10.5,20.5);
        // calling the sum method
        s.sum1();

        double result = s.sum2();
        System.out.println("Sum of method 2 :"+result);

        result = s.sum3(10.5,20.5);
        System.out.println("Sum of method 3 :"+result);
    }
}