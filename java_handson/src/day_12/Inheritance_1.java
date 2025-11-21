package day_12;
import java.util.Scanner;
public class Inheritance_1
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int len =sc.nextInt();
        int bred=sc.nextInt();
        Rectangle r=new Rectangle();
        r.len=len;
        r.bred=bred;
        r.color="red";
        System.out.println(r.color);
        r.draw();
        System.out.println(r.area());
    }
}
class Shape
{
    String color="Red";
    public void draw()
    {
        System.out.println("drawing shape");
    }
}
class Rectangle extends Shape
{
    int len=3;
    int bred=4;
    public int area()
    {
        return len*bred;
    }
}

