package day_11;
import java.util.Scanner;
public class Constructor_chaining
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bred=sc.nextInt();
        Rectangle4 r=new Rectangle4(4);
        r.area();
        r.display();
    }
}
class Rectangle4
{
    int len;
    int bred;
    Rectangle4()
    {
        this(3,4);
    }
    Rectangle4(int len)
    {
        this(len,len);
    }
    Rectangle4(int len ,int bred)
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
        System.out.println("length is "+len);
        System.out.println("breadth is "+bred);
        System.out.println("area is "+area());
    }
}

