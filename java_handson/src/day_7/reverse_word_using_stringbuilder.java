package day_7;
import java.util.Scanner;
public class reverse_word_using_stringbuilder
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String [] arr=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder sb=new StringBuilder(arr[i]);
            sb.reverse();
            arr[i]=sb.toString();
        }
        for(String s:arr)
        {
            System.out.print(s+" ");
        }
    }
}

