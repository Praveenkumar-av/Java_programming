/* This loop is specially designed to handle the elements of a collection. Collection represents a group of elements.
 For example, we can take an array as a collection or any class in java.util package can be considered as a collection.
 for each loop repeatedly executed a group of statements for each element of the collection. It exexcutes as many 
 as there are no. of elements in the collection.

Syntax :
    for(var : collection)
    {
        statements;
    }
*/

class ForEachLoop
{
    public static void main(String args[])
    {
        int arr[] = {200,19,34,-23,89};

        for(int i : arr)
        {
            System.out.println(i);  // i represents each element of array
        }
    }
}