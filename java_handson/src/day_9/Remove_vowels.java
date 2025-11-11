package day_9;
import java.util.Scanner;
public class Remove_vowels
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        char [] arr=str.toCharArray();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i] !='o' && arr[i]!='u')
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

