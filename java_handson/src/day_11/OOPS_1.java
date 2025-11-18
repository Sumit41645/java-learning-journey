package day_11;
import java.util.Scanner;
public class OOPS_1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth for object 1");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        System.out.println("area of object 1 "+r1.area(length,breadth));
        length=sc.nextInt();
        breadth=sc.nextInt();
        System.out.println("area of object 2 "+r2.area(length,breadth));
    }
}
class Rectangle
{
    public int area(int breadth, int length)
    {
        return length*breadth;
    }
}

