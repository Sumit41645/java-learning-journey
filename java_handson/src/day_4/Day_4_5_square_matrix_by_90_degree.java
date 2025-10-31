package day_4;
import java.util.Scanner;
public class Day_4_5_square_matrix_by_90_degree
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limits for 2d array");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        System.out.println("enter elements");
        int [][] arr=new int[rows][columns];
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
        System.out.println("90 degree Matrix");
        for(int i=0;i<rows;i++){
            for(int j=i+1;j<columns;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++)
        {
            int start=0;
            int end=columns-1;
            while(start<end)
            {
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

