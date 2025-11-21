package day_12;

public class Final_keyword
{
    public static void main(String [] args)
    {
        One2 s=new Two2();
        s.show();
        Third2 th=new Third2();
        th.print();
    }
}
class One2
{
    final int x=4;
    final void show()
    {
        System.out.println("hello there");
    }
}
class Two2 extends One2
{
//    void show()
//    {
//        System.out.println("hello two");
//    }
}
final class Third2 extends Two2
{
        void print()
        {
            System.out.println("bye");
        }
}


