package day_11;
import java.util.Scanner;
public class Constructor2
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int len=sc.nextInt();
        int bred=sc.nextInt();
        Rectangle3 r=new Rectangle3();
        r.area();
        r.display();
    }
}
class Rectangle3
{
    int len;
    int bred;
    Rectangle3()
    {
        len=3;
        bred=4;
    }
    Rectangle3(int len)
    {
        this.len=len;
        bred=len;
    }
    Rectangle3(int len,int bred)
    {
        this.len=len;
        this.bred=bred;
    }
    public int area()
    {
        return len*bred;
    }
    public void display()
    {
        System.out.println("area of rectangle is "+area());
    }
}
