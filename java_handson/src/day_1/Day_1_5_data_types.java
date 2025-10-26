package day_1;
import java.util.Scanner;
public class Day_1_5_data_types
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a number");
        int a=sc.nextInt();
        sc.close();
        if(a>=0)
        {
            System.out.println("number is positive");
        }
        else
        {
            System.out.println("number is negative");
        }
        if(a%2==0)
        {
            System.out.println("number is even ");
        }
        else
        {
            System.out.println("number is odd");
        }

    }
}

