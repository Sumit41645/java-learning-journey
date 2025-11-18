package day_11;
import java.util.Scanner;
public class Methods_types
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter some values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Rectangle1 r=new Rectangle1();
        System.out.println("with instance method "+r.area(a,b));
        System.out.println("with static method "+Rectangle1.addition(a,b));
        System.out.print("with void method ");
        r.sub(a,b);
        System.out.println();
        System.out.println("with method loading "+r.area(a,b,c));
    }
}
class Rectangle1
{


    public int area(int length,int breadth)
    {
        return length*breadth;
    }
    public static int addition(int length,int breadth)
    {
        return length+breadth;
    }
    public void sub(int length,int breadth)
    {
        System.out.println(" "+(length-breadth));
    }
    public int area(int length,int breadth,int c)
    {
        return length+breadth+c;
    }
}

