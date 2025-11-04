package day_6;
import java.util.Scanner;
public class finding_first_repeating_one
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String word=sc.nextLine();
        boolean [] visit=new boolean[word.length()];
        int count;
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
                if(ch==word.charAt(j))
                {
                    visit[j]=true;
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println(ch);
                break;
            }
        }
    }
}

