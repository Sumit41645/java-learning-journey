package day_9;
import java.util.Scanner;
public class Count_spaces
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        String [] arr=str.split(" ");
        int spaces=arr.length-1;
        System.out.println(spaces);
    }
}

