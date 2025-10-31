package day_4;
import java.util.Scanner;
public class Day_4_1_matrix_basics
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
        sc.close();
    }
}

