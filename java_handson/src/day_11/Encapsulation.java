package day_11;
import java.util.Scanner;
public class Encapsulation
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bred=sc.nextInt();
        Rectangle5 r=new Rectangle5();
        r.setBred(bred);
        r.setLen(len);
        r.display();
    }
}
class Rectangle5
{
   private int len;
    private int bred;
    public int getLen()
    {
        return len;
    }
    public void setLen(int len)
    {
        if(len>0) {
            this.len = len;
        }
        else
            System.out.println("invalid input");
    }
    public int getBred()
    {
        return bred;
    }
    public void setBred(int bred)
    {
        if(bred>0) {
            this.bred = bred;
        }
        else
            System.out.println("invalid input");
    }
    public int area()
    {
        return len*bred;
    }
    public void display()
    {
        System.out.println("area is "+area());
    }
}

