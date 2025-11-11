package day_7;
import java.util.Scanner;
public class check_anagram
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.nextLine();
        System.out.println("enter string 2");
        String str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length())
        {
            System.out.println("they are not anagram");

        }

        else
        {
            boolean [] visited=new boolean[str1.length()];
            for(int i=0;i<str1.length();i++)
            {

                if(visited[i])
                {
                    continue;
                }

                char  ch=str1.charAt(i);
                int count1=0;
                int count2=0;
                for(int j=0;j<str1.length();j++)
                {
                    if(str1.charAt(j)==ch)
                    {
                        count1++;
                        visited[j]=true;
                    }
                }
                for(int j=0;j<str2.length();j++)
                {
                    if(str2.charAt(j)==ch)
                    {
                        count2++;
                    }
                }
                if(count1!=count2)
                {
                    System.out.println("they are not anagram");
                    return;
                }
            }
            System.out.println("they are anagram");
        }


    }
}

