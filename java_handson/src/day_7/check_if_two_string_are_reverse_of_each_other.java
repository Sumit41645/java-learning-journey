package day_7;
import java.util.Scanner;
public class check_if_two_string_are_reverse_of_each_other
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        boolean flag=true;
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("they have different lengths");
            return;
        }
        int end=str1.length()-1;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(end)!=str2.charAt(i))
            {
                flag=false;
                break;
            }
            end--;
        }
        if(flag)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

