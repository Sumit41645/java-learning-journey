package day_12;

public class Super_Method
{
    public static void main(String [] args)
    {
        Three th=new Three();
    }
}
class One1
{
    One1()
    {
        System.out.println("class One1");
    }
}
class Two extends One1
{
    Two()
    {
        super();
        System.out.println("class Two");
    }
}
class Three extends Two
{
    Three()
    {
        super();
        System.out.println("class three");
    }
}

