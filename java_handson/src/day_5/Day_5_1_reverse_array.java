package day_5;
import java.util.Scanner;
public class Day_5_1_reverse_array
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limits for  array");
        int rows=sc.nextInt();
        System.out.println("enter elements in array");
        int [] arr=new int[rows];
        for(int i=0;i<rows;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("normal array");
        for(int i=0;i<rows;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("reverse array");
        int start=0;
        int last=rows-1;
        while(start<last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
        for(int i=0;i<rows;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

