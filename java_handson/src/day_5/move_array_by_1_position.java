package day_5;
import java.util.Scanner;
public class move_array_by_1_position
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
        System.out.println("before movement array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
           arr[i+1]=arr[i];
        }
        arr[0]=temp;
        System.out.println("after movement array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

