package day_4;
import java.util.Scanner;
public class Day_4_3_matrix_transpose
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limits for matrix");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        System.out.println("enter elements");
        int [][] arr=new int [rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Normal Matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of a matrix");
        for(int i=0;i<columns;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}

