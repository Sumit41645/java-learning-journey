package day_7;
import java.util.Scanner;
public class Count_word_in_a_sentence
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().trim();
        String [] arr=str.split("\\s+");
        if(str.isEmpty())
        {
            System.out.println("No string is there");
        }
        else {
            System.out.println(arr.length + " is the length of string");
        }
    }
}

