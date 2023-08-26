// After you declare a vaiable, you must initialize it before you can use it.
// If you try to use a variable that has not been initialized, you will get a compile-time error.
// An identifier consists of letters, digits, underscore and dollar sign.

public class InitializeVariable
{
    public static void main(String args[])
    {
        int i;
//      System.out.println(i);  Error: variable i might not have been initialized
        i=12;
        System.out.println(i);  

        int a = 12;
        System.out.println(a);

        float _float_value = 12.34f;
        System.out.println(_float_value);

        double $double_value = 34.532;
        System.out.println($double_value);
    }
}
