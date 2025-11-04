package day_6;
import java.util.Scanner;
public class check_palindrome_ignore_all_things
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter anything");
        String word=sc.nextLine();
        int start=0;
        boolean flag=true;
        int end=word.length()-1;

        while(start<end)
        {
            if(!Character.isLetterOrDigit(word.charAt(start)))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(word.charAt(end)))
            {
                end--;
            }
            else if(Character.toLowerCase(word.charAt(start))!=Character.toLowerCase(word.charAt(end)))
            {
               flag=false;
                break;
            }
            else
            {
                start++;
                end--;
            }
        }
        if(flag)
        {
            System.out.println("they are palindrome");
        }
        else
        {
            System.out.println("they are not palindrome");
        }
    }
}

