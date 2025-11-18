package day_10;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string 1");
        String str1=sc.nextLine().toLowerCase().replace(" ","");
        System.out.println("enter string 2");
        String str2=sc.nextLine().toLowerCase().replace(" ","");
        if(str1.length()!=str2.length())
        {
            System.out.println("they are not Anagrams");
            return;
        }
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean b=true;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                b=false;
            }
        }
        if(b)
        {
            System.out.println("they are anagram");
        }
        else
        {
            System.out.println("they are not Anagram");
        }


    }
}

