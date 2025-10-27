package day_2;
import java.util.Scanner;
public class Day_2_6_loops_prime_numbers
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0;
        boolean flag=true;
        for(int i=2;i<=n;i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }
            }
            if(flag==true)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Total primes found: "+count);
        sc.close();
    }
}

