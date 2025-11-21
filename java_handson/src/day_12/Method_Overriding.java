package day_12;

public class Method_Overriding
{
    public static void main(String [] args)
    {
        Second1 s=new Second1();
        s.show();
    }
}
class First
{
    void show()
    {
        System.out.println("first class");
    }
}
class Second1 extends First
{
    void show()
    {
       // super.show();
        System.out.println("second class");
    }
}

