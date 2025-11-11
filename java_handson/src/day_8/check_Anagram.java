package day_8;
import java.util.Scanner;
public class check_Anagram
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String 1");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length())
        {
            System.out.println("they are not anagram");
            return;
        }
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int [] map1=new int[256];

        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
          if(map1[ch1]==0 && map1[ch2]==0)
          {
              map1[ch1]++;
              map1[ch2]--;
          }
          else if(map1[ch1]!=0 || map1[ch2]!=0)
          {
              System.out.println("not anagram");
              return;
          }
        }
        System.out.println("they are ana");
    }
}

