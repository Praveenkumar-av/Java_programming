// A 2D array is a combination of more than two or more one dimensional(1D) arrays.

class Arrays2D
{
    public static void main(String args[])
    {
        int marks[][] = {{57, 78, 89, 98, 67}, {56, 67, 78, 89, 90}};

        // printing
        for(int i = 0; i < 2; i++)  // using for loop
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        } 

        // Alternate ways
        float f[][];
        f = new float[5][5];

        double d[][] = new double[2][5];

        byte b[][] = new byte[5][5];

        char ch[] = new char[4];

        boolean bool[] = new boolean[10];

        String[] str = new String[10];
    }
}