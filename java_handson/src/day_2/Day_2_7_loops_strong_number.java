package day_2;
import java.util.Scanner;
class cal
{
    public int find(int n)
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
        return sum;
    }
    public int fact(int n)
    {
        int num=1;
        for(int i=2;i<=n;i++)
        {
            num=num*i;
        }
        return num;
    }
}
public class Day_2_7_loops_strong_number
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        cal c=new cal();
        int num=c.find(n);
        if(n==num)
        {
            System.out.println("Strong number");
        }

        else
        {
            System.out.println("not a strong number");
        }
    }
}

