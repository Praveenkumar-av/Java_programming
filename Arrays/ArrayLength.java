// We can use the property 'length' to know the size of array.
// Syntax : arrayname.length
// It returns only the total size of the array not the number of elements present in the array.

class ArrayLength
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("Size of array is : " + arr.length);  // 5

        // But in case of 2D array, it returns the number of rows.
        int[][] arr2 = new int[3][4];
        System.out.println("Size of array is : " + arr2.length);  // 3
        System.out.println("Size of array is : " + arr2[0].length);  // 4
    }
}