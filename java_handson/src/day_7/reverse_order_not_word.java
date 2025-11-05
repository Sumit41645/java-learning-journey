package day_7;
import java.util.Scanner;
public class reverse_order_not_word
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String word=sc.nextLine();
        String [] arr=word.split(" ");
       int start=0;
       int end=arr.length-1;
       while(start<end)
       {
           String temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}

