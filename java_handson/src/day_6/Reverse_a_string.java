package day_6;
import java.util.Scanner;
public class Reverse_a_string
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String name=sc.next();
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}

