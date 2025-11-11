package day_9;
import java.util.Scanner;
public class Count_speacial
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(!(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

