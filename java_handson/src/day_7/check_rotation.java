package day_7;
//rotation=str2=str1+str1
import java.util.Scanner;
public class check_rotation
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string one");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        String str3=str1+str1;
        System.out.println(str3+" string");
        if(str3.contains(str2))
        {
            System.out.println("they are rotations");
        }
        else
        {
            System.out.println("they are not rotations");
        }
    }
}

