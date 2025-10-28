package day_3;
import java.util.Scanner;
public class Day_3_3_array_max_min
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbnber of elements");
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[1];
            }
        }
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("maximum "+max);
        System.out.println("minimum "+min);
    }
}

