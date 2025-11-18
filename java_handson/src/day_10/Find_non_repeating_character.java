package day_10;
import java.util.Scanner;
public class Find_non_repeating_character
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        char [] arr=str.toCharArray();
        boolean [] visited=new boolean[str.length()];
        //int [] arr=new int[256];
        char ch=' ';
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if(count==0)
            {
                ch=str.charAt(i);
                break;
            }
        }
        System.out.println(ch);
    }
}

