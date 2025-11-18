package day_10;
import java.util.Scanner;
public class Isogram
{
    //isogram where every character is unique of a string
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        char [] arr=str.toCharArray();
        boolean b=true;
       // boolean [] visited=new boolean[26];
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            //int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(ch==arr[j]) {
                    b=false;
                    break;
                }
            }
            if(!b)
                break;
        }
        //another approach (better)
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            // ignore spaces and non-alphabetic characters
//            if (ch < 'a' || ch > 'z') continue;
//
//            int index = ch - 'a';  // find position (0 to 25)
//
//            if (visited[index]) {
//                isIsogram = false; // already seen this character
//                break;
//            }
//            visited[index] = true;
//        }
        if(b)
        {
            System.out.println("isogram");
        }
        else
        {
            System.out.println("not a Isogram");
        }
    }
}

