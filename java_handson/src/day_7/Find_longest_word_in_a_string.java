package day_7;
import java.util.Scanner;
public class Find_longest_word_in_a_string
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String word=sc.nextLine();
        String [] arr=word.split(" ");
        int maxlength=arr[0].length();
        String str=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(maxlength<arr[i].length())
            {
                maxlength=arr[i].length();
                str=arr[i];
            }
        }
        System.out.println(str);
    }
}

