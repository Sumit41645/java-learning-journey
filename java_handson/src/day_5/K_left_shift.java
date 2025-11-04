package day_5;
import java.util.Scanner;
public class K_left_shift
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter how many positions you want to shift");
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        if(k>n)
        {
            for(int i=0;i<k%n;i++)
            {
                int temp=arr[0];
                for(int j=1;j<n;j++)
                {
                    arr[j-1]=arr[j];
                }
                arr[n-1]=temp;
            }
        }
        else
        {
            for(int i=0;i<k;i++)
            {
                int temp=arr[0];
                for(int j=1;j<n;j++)
                {
                    arr[j-1]=arr[j];
                }
                arr[n-1]=temp;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

