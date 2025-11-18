package day_11;
import java.util.Scanner;
public class constructors
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int len=sc.nextInt();
        int bred=sc.nextInt();
        Reactangle2 r=new Reactangle2(len,bred);
        r.area();
        r.perimeter();
        r.display();
    }
}
class Reactangle2
{
    int len;
    int bred;
   Reactangle2(int len,int bread)
   {
       this.len=len;
       this.bred=bread;
   }
   public int area()
   {
       return len*bred;
   }
   public int perimeter()
   {
       return 2*(len+bred);
   }
   public void display()
   {
       System.out.println("length "+len+" breadth "+bred);
       System.out.println("area is "+area());
       System.out.println("Perimeter is "+perimeter());
   }
}

