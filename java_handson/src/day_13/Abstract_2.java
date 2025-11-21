package day_13;

public class Abstract_2
{
    public static void main(String [] args)
    {
        focused f=new focused();
        f.print();
        f.display();
    }
}
abstract class focus
{
    public void print()
    {
        System.out.println("hello this is print method from focus class");
    }
    abstract void display();
}
class focused extends focus
{
    void display()
    {
        System.out.println("hello this is display method from focused class");
    }
}
