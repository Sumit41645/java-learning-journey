package day_13;

public class Abstract_3
{
    public static void main(String [] args)
    {
        A obj=new C();
        obj.m1();
        obj.show();
    }
}
abstract class A
{
    A()
    {
        System.out.println("A's constructor");
    }
    abstract void m1();
    void show()
    {
        System.out.println("show from A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("B's constructor");
    }
    void m1()
    {
        System.out.println("m1 from B class");
    }
}
class C extends B
{
    C()
    {
        System.out.println("C's constructor");
    }
    void m1()
    {
        System.out.println("m1 from C class");
    }
}

