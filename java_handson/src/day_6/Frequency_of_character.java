package day_6;
import java.util.Scanner;
public class Frequency_of_character
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String word=sc.nextLine();
        int count;
        word=word.toLowerCase();
        boolean [] visited=new boolean[word.length()];
        for(int i=0;i<word.length();i++)
        {
            if(visited[i])
            {
                continue;
            }
            char ch=word.charAt(i);
            if(!Character.isLetter(ch))
            {
                continue;
            }
            count=0;
            for(int j=i;j<word.length();j++)
            {

                if(ch==word.charAt(j))
                {
                     visited[j] = true;
                    count++;
                }
            }
            System.out.println(ch+" "+count+" times");
        }
    }
}

