package day_8;
import java.util.Scanner;
public class Remove_spaces
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        char [] arr=str.toCharArray();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=' ')
            {
               arr[index]=arr[i];
               index++;
            }
        }
        str=new String(arr,0,index);
        System.out.println(str);
    }
}

