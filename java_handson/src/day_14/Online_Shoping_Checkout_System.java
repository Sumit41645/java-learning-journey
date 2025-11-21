package day_14;
import java.util.Scanner;
public class Online_Shoping_Checkout_System
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Order ID: ");
        long orderID=sc.nextLong();
        System.out.println("Enter Customer name: ");
        String name=sc.next();
        System.out.println("Enter Order Amount: ");
        double amount=sc.nextDouble();
        OnlineOrder or=new OnlineOrder(orderID,name);
        amount=or.applyDiscount(amount);
        or.showOffer();
        System.out.println("Final Amount after discount: "+amount);
        or.makePayment(amount);
        or.getPaymentStatus();
    }
}
interface Payment
{
    void makePayment(double amount);
    void getPaymentStatus();
}
interface Discount
{
    double applyDiscount(double amount);
    default void showOffer()
    {
        System.out.println("Festive Offer Applied");
    }
}
class OnlineOrder implements Payment,Discount
{
    long orderId;
    String customerName;
    OnlineOrder(long orderId,String customerName)
    {
        this.orderId=orderId;
        this.customerName=customerName;
    }
    public double applyDiscount(double amount)
    {
        if(amount>5000)
        {
           amount=amount-(amount*0.10);
           return amount;
        }

        amount=amount-(amount*0.05);
        return amount;
    }
    public void makePayment(double amount)
    {
        System.out.println("Payment of ₹"+amount+" successful");
    }
    public void getPaymentStatus()
    {
        System.out.println("Payment completed");
    }
}

