package day_3;
import java.util.Scanner;
public class Day_3_4_second_largest
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=sc.nextInt();
        System.out.println("enter elments");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lar=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(lar<arr[i])
            {
                sec=lar;
                lar=arr[i];
            }
            else if(lar>arr[i] && sec<arr[i])
            {
                sec=arr[i];
            }
        }
        System.out.println("second largest "+sec);
    }
}

