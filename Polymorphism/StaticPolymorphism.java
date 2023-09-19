/* It is also known as Compile-time polymorphism. This type of polymorphism is achieved by function overloading.

Method Overloading :
    When there are multiple functions with the same name but difference in method signature then these functions are said 
to be overloaded. Method signature represents the method name along with method parameters.
    The difference in method signature will arise because of the difference in :
        1. Number of parameters
            void add(int a, int b)
            void add(int a, int b, int c)

        2. Data type of parameters
            void add(int a, int b)
            void add(float a, float b)

        3. Sequence(orderliness) of Data type of parameters
            void add(int a, float b)
            void add(float a, int b)    */

class Calculate
{
    int multiply(int a, int b)  // method 1
    {
        return (a*b);
    }

    double multiply(double a, double b)  // method 2
    {
        return (a*b);
    }
}

class StaticPolymorphism
{
    public static void main(String args[])
    {
        Calculate c = new Calculate();
        System.out.println(c.multiply(10, 20));     // method 1 is called
        System.out.println(c.multiply(10.5, 20.5)); // method 2 is called
    }
}