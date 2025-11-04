package day_6;
import java.util.Scanner;
public class check_palimdrome
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a anything");
        String word=sc.nextLine();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--)
        {
            reverse=reverse+word.charAt(i);
        }
        System.out.println("original string is "+word);
        System.out.println("reverse string is "+reverse);
        if(reverse.equals(word))
        {
            System.out.println("they are palimdrome");
        }
        else
        {
            System.out.println("they are not palimdrome");
        }
    }
}

