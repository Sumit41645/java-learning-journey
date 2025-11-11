package day_8;
import java.util.Scanner;
public class change_upp_to_lower_and_lower_to_upp
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);
            }
            else if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
            }
            arr[i]=ch;
        }
        str=new String(arr);
        System.out.println(str);
    }
}

