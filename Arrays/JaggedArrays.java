// A jagged array is an array that contains group of elements within it. It can store arrays of any type.
// A jagged array is also called 'irregular multidimensional arrays'

class JaggedArrays
{
    public static void main(String[] args)
    {
        // Declare the array of two elements:
        int[][] x = new int[2][];

        x[0] = new int[2];
        x[1] = new int[3];

        // Initialize the elements:
        x[0][0] = 10;  
        x[0][1] = 20;

        x[1][0] = 30;
        x[1][1] = 40;
        x[1][2] = 50;

        // Display the elements:
        int i;
        for(i=0;i<2;i++)
        {
            System.out.println(x[0][i]+" ");
        }

        for(i=0;i<3;i++)
            System.out.println(x[1][i]+" ");
    }
}