package day_8;
import java.util.Scanner;
public class Count_vowels_and_Consonants
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int vowels=0;
        int cons=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                vowels++;
            }
            else if(Character.isAlphabetic(str.charAt(i)))
            {
                cons++;
            }
        }
        System.out.println("Vowels "+vowels);
        System.out.println("Consonants "+cons);
    }
}

