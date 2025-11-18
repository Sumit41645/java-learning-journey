package day_10;
import java.util.Scanner;
public class Meta_Strings
{
//    Two strings are meta strings if:
//
//    They are of same length
//
//    They are not equal
//
//    They can be made equal by exactly one swap of characters in one string
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        String str2=sc.nextLine();
        //boolean b=true;
        char [] ch1=new char[2];
        char [] ch2=new char[2];
        int count=0;
        if(str1.length()!=str2.length())
        {
           // b=false;
            return;
        }
        if(str1.equals(str2)) {
            System.out.println("Not meta strings");
            return;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                if(count==2)
                    break;
                ch1[count]=str1.charAt(i);
                ch2[count]=str2.charAt(i);
                count++;
            }
        }
//        int index=0;
        if(count==2) {
            if (ch1[0] == ch2[1] && ch1[1] == ch2[0]) {
                System.out.println("they are meta string");
            }
        }
        else
        {
            System.out.println("they are not meta strings");
        }

    }
}

