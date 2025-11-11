package day_9;
import java.util.Scanner;
public class Remove_Particuler_character
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        System.out.println("enter a character you want to remove");
        char ch=sc.next().charAt(0);
        int index=0;
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=ch)
            {
               arr[index]=arr[i];
               index++;
            }
            else
                continue;
        }
        str=new String(arr,0,index);
        System.out.println(str);
    }
}

