package day_2;
import java.util.Scanner;
public class Day_2_2_loops_while_dowhile
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of iterations");
        int n=sc.nextInt();
        int temp=n;
        while(temp>0)
        {
            System.out.print(" "+temp);
            temp--;
        }
        System.out.println();
        int temp1=1;
        do
        {
            System.out.print(" "+temp1);
            temp1++;
        }while(temp1<=n);
        sc.close();
    }
}

