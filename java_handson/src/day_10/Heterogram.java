package day_10;
import java.util.Scanner;
public class Heterogram
{
    //Heterogram are those string in which only alphabets are present and are not repeating
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        boolean [] visited=new boolean[26];
        char [] arr=str.toCharArray();
        boolean b=true;
//        for(int i=0;i<arr.length;i++)
//        {
//            char ch=arr[i];
//            if(ch<'a' || ch>'z')
//            {
//                b=false;
//                break;
//            }
//
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(ch==arr[j])
//                {
//                    b=false;
//                    break;
//                }
//            }
//            if(!b)
//            {
//                break;
//            }
//        }
        //second approach
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(ch<'a' || ch>'z')
            {
               continue;
            }
            int index=ch-'a';
            if(visited[index])
            {
                b=false;
                break;
            }
            visited[index]=true;

        }
        if(b)
        {
            System.out.println("Heterogram");
        }
        else
        {
            System.out.println("not a Heterogram");
        }
    }
}

