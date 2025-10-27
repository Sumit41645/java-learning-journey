package day_2;
import java.util.Scanner;
public class Day_2_1_loops_basics
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for iterations");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of number is "+sum);
    }
}

