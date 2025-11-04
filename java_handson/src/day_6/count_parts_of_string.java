package day_6;
import java.util.Scanner;
public class count_parts_of_string
{
    public  static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter anything");
        String word=sc.nextLine();
        int vowels=0;
        int digit=0;
        int consonant=0;
        for(int i=0;i<word.length();i++)
        {

            if( Character.toLowerCase(word.charAt(i))=='a' ||  Character.toLowerCase(word.charAt(i))=='e' ||  Character.toLowerCase(word.charAt(i))=='i' ||  Character.toLowerCase(word.charAt(i))=='o' ||  Character.toLowerCase(word.charAt(i))=='u')
            {
                vowels++;
            }
            else if(Character.isDigit(word.charAt(i)))
            {
                digit++;
            }
            else if(Character.isLetter(word.charAt(i)) && Character.toLowerCase(word.charAt(i))!='a' && Character.toLowerCase(word.charAt(i))!='e' && Character.toLowerCase(word.charAt(i))!='i'&& Character.toLowerCase(word.charAt(i))!='o' && Character.toLowerCase(word.charAt(i))!='u')
            {
                consonant++;
            }
        }
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonant);
        System.out.println("Number of digits: "+digit);

    }
}

