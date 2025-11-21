package day_12;
public class Multilevel_Inheritance
{
    public static void main(String [] args)
    {
        C cc=new C();
        cc.showA();
        cc.showB();
        cc.ShowC();
    }
}
class A
{
    void showA()
    {
        System.out.println("hello A class");
    }
}
class B extends A
{
    void showB()
    {
        System.out.println("hello B class");
    }
}
class C extends B
{
    void ShowC()
    {
        System.out.println("hello C class");
    }
}
