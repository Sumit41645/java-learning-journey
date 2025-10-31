package day_4;
import java.util.Scanner;
public class Day_4_2_matrix_row_col_sum
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limits for 2d array");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int [][] arr=new int[rows][columns];
        System.out.println("enter elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("row sum:- ");
        for(int i=0;i<rows;i++)
        {
            int sum=0;
            for(int j=0;j<columns;j++)
            {
               sum=sum+arr[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
        System.out.print("column sum:- ");
        for(int i = 0; i < columns; i++)
        {
            int sum = 0;
            for(int j = 0; j < rows; j++)
            {
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
        }
        sc.close();
    }
}

