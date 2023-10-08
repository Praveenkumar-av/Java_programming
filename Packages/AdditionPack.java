import package1.Addition;  // importing 'Addition' class of 'package1' package

class AdditionPack
{
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        double result = obj.sum(10.5, 20.5);
        System.out.println("Sum = " + result);
    }
}