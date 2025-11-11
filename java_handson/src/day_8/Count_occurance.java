package day_8;
import java.util.Scanner;
public class Count_occurance 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        str=str.toLowerCase();
        char [] arr=str.toCharArray();
        boolean [] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i] || arr[i]==' ')
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                  visited[j]=true;
                    count++;
                }
            }
                System.out.println(arr[i] + " " + count);
        }
    }
}

