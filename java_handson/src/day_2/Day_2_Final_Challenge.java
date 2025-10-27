package day_2;
import java.util.Scanner;
public class Day_2_Final_Challenge
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println("Prime");
                count1++;
            }
            else if(isStrong(i))
            {
                System.out.println("Strong");
                count2++;
            }
            else if(isPerfect(i))
            {
                System.out.println("Perfect");
                count3++;
            }
            else
            {
                System.out.println(i);
            }
        }
        System.out.println("Total Primes: "+count1);
        System.out.println("Total Strong: "+count2);
        System.out.println("Total Perfect: "+count3);
    }

    private static boolean isPerfect(int n)
    {
        int sum=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n)
    {
            for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                   return false;
                }
            }
        return true;
    }
    public static boolean isStrong(int n)
    {
        int num=0;
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int last=temp%10;
            num=fact(last);
            sum=sum+num;
            temp=temp/10;
        }
        if(sum==n) {
            return true;
        }
        return false;
    }
    public static int fact(int n)
    {
        int num=1;
        for(int i=2;i<=n;i++)
        {
            num=num*i;
        }
        return num;
    }
}

