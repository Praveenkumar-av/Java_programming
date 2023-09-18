/* Primitive data types like int, float, double, char, boolean are passed by value in Java.
  This means that any changes made to the values of the parameters exist only within the scope of the method.
  The original value of the argument is not changed.  */

class Sample
{
    // to interchange the values of two variables
    void swap(int num1,int num2)
    {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

class PassPrimitiveData
{
    public static void main(String args[])
    {
        int num1 = 10;
        int num2 = 20;
        Sample s = new Sample();
        System.out.println("Before swapping: num1 = "+num1+" num2 = "+num2);
        s.swap(num1,num2);
        System.out.println("After swapping: num1 = "+num1+" num2 = "+num2);
    }
}