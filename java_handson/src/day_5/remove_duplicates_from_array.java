package day_5;
import java.util.Scanner;
public class remove_duplicates_from_array
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter elements in array");
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
           if(arr[start]!=arr[end])
           {
               System.out.print(arr[start]+" ");
               start=end;
               end++;
           }
           else
           {
               start++;
               end++;
           }
       }
        System.out.println(arr[start]);
    }
}

