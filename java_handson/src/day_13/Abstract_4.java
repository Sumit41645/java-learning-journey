package day_13;
import java.util.Scanner;
public class Abstract_4
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        System.out.println("enter radius");
        int radius=sc.nextInt();
        c.setRadius(radius);
        c.area();
        c.perimeter();
        Rectangle r=new Rectangle();
        System.out.println("enter length and breadth");
        int length=sc.nextInt();
        int breath=sc.nextInt();
        r.setBreadth(breath);
        r.setLength(length);
        r.area();
        r.perimeter();
        Triangle t=new Triangle();
        System.out.println("enter height and base");
        int height=sc.nextInt();
        int base=sc.nextInt();
        t.setHeight(height);
        t.setBase(base);
        t.area();
        t.perimeter();
    }
}
abstract class Shape
{
    abstract void area();
    abstract void perimeter();
    void display()
    {
        System.out.println("shape details");
    }
}
class Circle extends Shape
{
    int radius;
    void setRadius(int radius)
    {
        this.radius=radius;
    }
   int getRadius()
   {
      return radius;
   }

    void area()
    {
        System.out.println("Area of circle is "+(Math.PI*radius*radius));
    }
    void perimeter()
    {
        System.out.println("Perimeter of circle is "+(2*Math.PI*radius));
    }
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    void setLength(int length)
    {
        this.length=length;
    }
    int getLength()
    {
        return length;
    }
    void setBreadth(int breadth)
    {
        this.breadth=breadth;
    }
    int getBreadth()
    {
        return breadth;
    }
    void area()
    {
        System.out.println("Area of Rectangle is "+length*breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter of Rectangle is "+2*(length+breadth));
    }
}
class Triangle extends Shape
{
    int base;
    int height;
    void setBase(int base)
    {
        this.base=base;
    }
    int getBase()
    {
        return base;
    }
    void setHeight(int height)
    {
        this.height=height;
    }
    int getHeight()
    {
        return height;
    }
    void area()
    {
        System.out.println("Area of triangle is "+(0.5*height*base));
    }
    void perimeter()
    {
        System.out.println("not implemented");
    }
}

