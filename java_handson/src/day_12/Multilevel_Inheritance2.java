package day_12;

public class Multilevel_Inheritance2
{
    public static void main(String [] args)
    {
        Second s=new Second();
        s.show();
        s.display();
        s.both();
    }
}
class One
{
    int x=10;
    void show()
    {
        System.out.println("value of X"+x);
    }
}
class Second extends One
{
    int x=20;
    void display()
    {
        System.out.println("value of x"+x);
    }
    void both()
    {
        System.out.println("x in show" +x);
        System.out.println("x in display "+super.x);
    }
}




