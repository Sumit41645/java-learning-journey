package day_12;

public class Runtime_Polymorphism
{
    public static void main(String [] args)
    {
        First1 th=new Third();
        th.show();
    }
}
class First1
{
    void show()
    {
        System.out.println("first one");
    }
}
class Second2 extends First1
{
    void show()
    {
        System.out.println("second one");
    }
}
class Third extends Second2
{
    void show()
    {
        System.out.println("third one");
    }
}

