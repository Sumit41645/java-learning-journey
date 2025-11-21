package day_13;

public class Abstraction_1
{
    public static void main(String [] args)
    {
        breadth b=new breadth();
        b.work();
    }
}
abstract class length
{
    length()
    {
        System.out.println("hello this is length constructor");
    }
    abstract public void work();
}
class breadth extends length
{
    public void work()
    {
        System.out.println("hello this is work");
    }

}

