package day_14;
import java.util.Scanner;
public class Payment_Gate_Way
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        int n=sc.nextInt();
        System.out.println("Enter amount:");
        double amount=sc.nextDouble();
        PaymentGateway pg;
        if(n==1)
        {
            pg=new UPIPayment();
        }else
        {
            pg=new CardPayment();
        }
        pg.pay(amount);
        pg.refund(amount);

    }
}
interface PaymentGateway
{
    void pay(double amount);
    void refund(double amount);
}
class UPIPayment implements PaymentGateway
{
    public void pay(double amount)
    {
        System.out.println("Paid via UPI: ₹"+amount);
    }
    public void refund(double amount)
    {
        System.out.println("Refund via UPI: ₹"+amount);
    }
}
class CardPayment implements PaymentGateway
{
    public void pay(double amount)
    {
        System.out.println("Paid via Card: ₹"+amount);
    }
    public void refund(double amount)
    {
        System.out.println("Refund via Card: ₹"+amount);
    }
}
