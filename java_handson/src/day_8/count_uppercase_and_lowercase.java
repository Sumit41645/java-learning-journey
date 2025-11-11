package day_8;
import java.util.Scanner;
public class count_uppercase_and_lowercase
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int upp=0;
        int down=0;
        for(int i=0;i<str.length();i++) {

            if(Character.isDigit(str.charAt(i)))
            {
                continue;
            }
            else if (Character.isUpperCase(str.charAt(i)))
            {
                upp++;
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                down++;
            }
        }
        System.out.println("uppercase "+upp);
        System.out.println("lowercase "+down);
    }
}

