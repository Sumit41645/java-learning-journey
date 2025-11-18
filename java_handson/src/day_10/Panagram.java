package day_10;
import java.util.Scanner;
public class Panagram
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        char [] arr=str.toCharArray();
        boolean [] visited=new boolean[26];

        for(int i=0;i<arr.length;i++)
        {
           char ch=str.charAt(i);
           if(ch>='a' && ch<='z') //heere we are specify the value between a and z
           {
               visited[ch-'a']=true; //here as we have ASCII values we will use them to set values in visited array
           }
        }
        boolean yes=true;
        for(int i=0;i<26;i++)
        {
            if(!visited[i]) {
                yes = false;
                break;
            }
        }
       if(yes)
       {
           System.out.println("panagram");
       }
       else
       {
           System.out.println("not a panagram");
       }
    }
}

