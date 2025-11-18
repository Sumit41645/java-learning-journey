package day_9;
import java.util.Scanner;
public class Check_if_string_contain_only_alphabets
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        char [] arr=str.toCharArray();
        for (char c : arr) {
            if (Character.isDigit(c)) {
                System.out.println("No");
                break;
            }
        }

    }
}

