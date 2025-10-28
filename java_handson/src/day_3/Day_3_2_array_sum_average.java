package day_3;
import java.util.Scanner;
public class Day_3_2_array_sum_average
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of elements");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter elments");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of array is "+sum);
        System.out.println("average of array is "+(float)(sum/n));
    }
}

