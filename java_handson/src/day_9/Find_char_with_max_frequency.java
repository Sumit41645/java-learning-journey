package day_9;
import java.util.Scanner;
public class Find_char_with_max_frequency
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();

        char ch=' ';
        int max=0;
        char [] arr=str.toCharArray();
        boolean [] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i] ||arr[i]==' ')
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }
            if(max<count)
            {
                max=count;
                ch=arr[i];
            }
        }
        System.out.println(ch+" occurs "+max+" times");

    }
}

