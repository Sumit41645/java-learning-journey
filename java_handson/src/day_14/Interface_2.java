package day_14;

public class Interface_2
{
    public static void main(String [] args)
    {
        Printer p=new MultiFunction();
        p.print();
        ScannerDevice s=new MultiFunction();
        s.scan();
        MultiFunction m=new MultiFunction();
        m.print();
        m.scan();
    }
}
interface Printer
{
    void print();
}
interface ScannerDevice
{
    void scan();
}
class MultiFunction implements Printer,ScannerDevice
{
    public void print()
    {
        System.out.println("hello printer");
    }
    public void scan()
    {
        System.out.println("hello scanner");
    }
}

