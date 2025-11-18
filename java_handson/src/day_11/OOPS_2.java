package day_11;
import java.util.Scanner;
public class OOPS_2
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle");
        int r=sc.nextInt();
        Circle c=new Circle(r);
        c.area();
        c.perimeter();
    }
}
class Circle
{
    int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        System.out.println("Area of Circle is "+(float)(Math.PI*radius*radius));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of Circle is "+2*Math.PI*radius);
    }
}

