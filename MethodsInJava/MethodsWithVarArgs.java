/* Method with Variable arguments 
Method with varable arguments is a method that accepts 0 or more number of arguments.
We can pass induvidual elements or an array also to this method. This type of method is called 
'method with variable arguments' or 'method with varargs'. Eg : int sum(int ...x)
Here three dots represent a parameter that accepts any number of arguments.
*/

class VArgs
{
    // This is a varargs method. It can accept arbitrary number of arguments.
    static int findSum(int ...x)
    {
        int sum=0;
        int n = x.length;
        for(int i=0;i<n;i++)
        {
            sum += x[i];
        }
        return sum;
    }
}

class MethodsWithVarArgs
{
    public static void main(String args[])
    {
        int result;
        // pass elements to varargs method
        result = VArgs.findSum(10,20,30);
        System.out.println("Sum is "+result);

        int arr[] = {1,2,3,4};
        // pass array to varargs method
        result = VArgs.findSum(arr);
        System.out.println("Sum of array is "+result);
    }
}

/* Internally, vararg is treated as a one dimensional array. If we pass individual elements to method, the vararg 
'x' will become an array and stores them all. Suppose, if we pass an array to this method, then all the elements are 
copied into 'x' array. */