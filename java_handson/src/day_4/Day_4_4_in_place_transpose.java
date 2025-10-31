package day_4;
import java.util.Scanner;
public class Day_4_4_in_place_transpose
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limits for 2d array");
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        System.out.println("enter elements");
        int [] [] arr=new int [rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        if(rows!=columns)
        {
            System.out.println("rows and columns are not same");
            System.exit(0);
        }
        else
        {
        System.out.println("Normal Matrix:-");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:-");
        for(int i=0;i<rows;i++)
        {
            for(int j=i+1;j<columns;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

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
}

