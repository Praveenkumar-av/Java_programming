import package1.*; // importing all classes of 'package1' package

class AdditionAndSubtraction
{
    public static void main(String[] args)
    {
        Addition obj1 = new Addition();
        double result1 = obj1.sum(10.5, 20.5);
        System.out.println("Sum = " + result1);

        Subtraction obj2 = new Subtraction();
        double result2 = obj2.sub(10.5, 20.5);
        System.out.println("Subtraction = " + result2);
    }
}