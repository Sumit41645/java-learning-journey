package day_13;
import java.util.Scanner;
public class Bank_Account_System
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 → Saving Account");
        System.out.println("2 → Current Account");
        int n=sc.nextInt();
        BankAccount ba;
        System.out.println("account number: ");
        long accno=sc.nextLong();
        System.out.println("holder name ");
        String name=sc.next();
        System.out.println("initial balance ");
        double balance=sc.nextDouble();
        System.out.println("Enter amount to deposit ");
        double deposit=sc.nextDouble();
        System.out.println("Enter amount to withdraw");
        double withdraw=sc.nextDouble();
        if(n==1)
        {
            ba=new SavingAccount(accno,name,balance);
            ba.deposit(deposit);
            ba.withdraw(withdraw);
            ba.showDetails();
            //System.out.println("Balance: "+ba.balance);
        }
        else
        {
            ba=new CurrentAccount(accno,name,balance);
            ba.deposit(deposit);
            ba.withdraw(withdraw);
            ba.showDetails();
           // System.out.println("Balance: "+ba.balance);
        }
    }
}
abstract class BankAccount
{
    long accountNumber;
    String holderName;
    double balance;
    BankAccount(long accountNumber,String holderName,double balance)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    abstract double deposit(double amount);
    abstract double withdraw(double amount);
    void showDetails()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
    }
}
class SavingAccount extends BankAccount
{

    SavingAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }

    double deposit(double amount)
    {
        balance=balance+amount;
        return balance;
    }
    double withdraw(double amount)
    {
        if(balance-amount>=1000)
        {
            balance=balance-amount;
            return balance;
        }
        System.out.println("Insufficient Balance");
        return -1;
    }
}
class CurrentAccount extends BankAccount
{

    CurrentAccount(long accountNumber, String holderName, double balance)
    {
        super(accountNumber, holderName, balance);
    }
    double deposit(double amount)
    {
        balance=balance+amount;
        return balance;
    }
    double withdraw(double amount)
    {
        if(balance-amount>=-5000)
        {
            balance=balance-amount;
            return balance;
        }
        System.out.println("Overdraft limit exceeded");
        return -1;
    }
}
