package day_5;
import java.util.Scanner;
public class move_array_by_k_positions
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
        System.out.println("for how many positions you want to move array");
        int k=sc.nextInt();
        System.out.println("before movement array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("after movement array");
        for(int i=0;i<k;i++)
        {
            int temp=arr[n-1];
            for(int j=n-2;j>=0;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[0]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

