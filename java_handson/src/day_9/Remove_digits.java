package day_9;
import java.util.Scanner;
public class Remove_digits
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int index=0;
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(!Character.isDigit(arr[i]))
            {
                arr[index]=arr[i];
                index++;
            }
        }
        str=new String(arr,0,index);
        System.out.println(str);
    }
}

