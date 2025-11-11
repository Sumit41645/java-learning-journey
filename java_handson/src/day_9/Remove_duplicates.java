package day_9;
import java.util.Scanner;
public class Remove_duplicates
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        int index=0;
        boolean [] visited=new boolean[str.length()];
        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(visited[i])
            {
                continue;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) {
                    visited[j] = true;
                }
            }
            arr[index]=arr[i];
            index++;
        }
        str=new String(arr,0,index);
        System.out.println(str);
    }
}

