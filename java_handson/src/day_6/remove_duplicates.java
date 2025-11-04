package day_6;
import java.util.Scanner;
public class remove_duplicates
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String word=sc.nextLine();
        word=word.toLowerCase();
        boolean [] visited=new boolean[word.length()];
        int count;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            count=0;
            if(visited[i])
            {
                continue;
            }
            if(!Character.isLetterOrDigit(ch))
            {
                continue;
            }
            System.out.print(ch);
             for(int j=i+1;j<word.length();j++)
             {
                 if(ch==word.charAt(j))
                 {
                     visited[j]=true;
                 }
             }
        }
    }
}

