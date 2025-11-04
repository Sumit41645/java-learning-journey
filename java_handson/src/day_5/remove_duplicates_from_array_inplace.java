package day_5;
import java.util.Scanner;
public class remove_duplicates_from_array_inplace
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elements");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start=0;
        int end=1;
        while(end<n)
        {
           if(arr[start]!=arr[end] && start<end)
           {
               start++;
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               end++;
           }
           else {
               end++;
           }
        }
        // another aaproch bu copying the elements
//        for(int i=1;i<n;i++)
//        {
//            if(arr[i]!=arr[start])
//            {
//                start++;
//                arr[start]=arr[i];
//
//            }
//        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

