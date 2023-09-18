// Program to add two matrices and display sum matrix.
// In this case, an array name should be understood as an object refernce.

import java.util.Scanner;
class Matrix
{
    int arr[][];
    int r,c;
    Matrix(int r,int c)
    {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }
    // accept 2D array from keyboard and return it
    int[][] getMatrix()
    {
        int i, j;
        Scanner scan = new Scanner(System.in);
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    // accept two 2D arrays and return their sum
    int[][] findSum(int a[][],int b[][])
    {
        int i, j;
        int sum[][] = new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // display the 2D array
    void display(int arr[][])
    {
        int i, j;
        System.out.println("The sum matrix is :");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class PassArrays
{
    public static void main(String args[])
    {
        int r, c;
        Scanner scan = new Scanner(System.in);

        Matrix m1 = new Matrix(3,3);
        Matrix m2 = new Matrix(3,3);
        Matrix m3 = new Matrix(3,3);

        int x[][], y[][], z[][];
        System.out.println("Enter elements of first matrix :");
        x = m1.getMatrix();
        System.out.println("Enter elements of second matrix :");
        y = m2.getMatrix();
        // find sum of two matrices
        z = m3.findSum(x,y);
        m3.display(z);
    }
}