package day_6;
import java.util.Scanner;
public class print_first_non_repeating_character
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String word=sc.nextLine();
        int count;
        boolean [] visit=new boolean[word.length()];
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            count=0;
            if(visit[i])
            {
                continue;
            }
            if(!Character.isLetterOrDigit(ch))
            {
                continue;
            }
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j)) {
                    visit[j] = true;
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}

