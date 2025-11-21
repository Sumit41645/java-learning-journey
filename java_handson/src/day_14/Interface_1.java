package day_14;

public class Interface_1
{
    public static void main(String [] args)
    {
        Device f=new Fan();
        f.turnOn();
        f.turnOff();
        Device l=new Light();
        l.turnOn();
        l.turnOff();
    }
}
interface Device
{
    void turnOn();
    void turnOff();
}
class Fan implements Device
{
    public void turnOn()
    {
        System.out.println("Turn on the Fan");
    }
    public void turnOff()
    {
        System.out.println("Turn Off the Fan");
    }
}
class Light implements Device
{
    public void turnOn()
    {
        System.out.println("Turn on the Light");
    }
    public void turnOff()
    {
        System.out.println("Turn Off the Light");
    }
}

