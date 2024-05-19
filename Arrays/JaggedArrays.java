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
        int i, j;

        for(i=0;i < x.length;i++)
        {
            for(j=0;j < x[i].length;j++)
            {
                System.out.println(x[i][j]);
            }
        }
    }
}