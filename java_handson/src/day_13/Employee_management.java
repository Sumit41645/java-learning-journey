package day_13;
import java.util.Scanner;
public class Employee_management
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("which employee's salary you want to check");
        System.out.println("1.Full Time Employee");
        System.out.println("2.Part Time Employee");
        int n=sc.nextInt();
        Employee emp;
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter id: ");
        int id=sc.nextInt();
        if(n==1)
        {

            System.out.println("Enter monthly salary");
            double salary=sc.nextDouble();
            emp=new FullTimeEmployee(id,name,salary);
            emp.showDetails();
            System.out.println("salary: "+ emp.calculateSalary());
        }
       else
       {
           System.out.println("enter hourly rate");
           double rate=sc.nextDouble();
           System.out.println("enter working hours");
           int hour=sc.nextInt();
           emp = new PartTimeEmployee(id,name,rate,hour);
           emp.showDetails();
           System.out.println("Salary: "+emp.calculateSalary());
        }
    }
}

abstract class Employee
{
    String name;
    int id;
    Employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    abstract double calculateSalary();
    void showDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
class FullTimeEmployee extends Employee
{
    double monthlySalary;
    FullTimeEmployee(int id,String name,double monthlySalary)
    {
        super(name,id);
        this.monthlySalary=monthlySalary;
    }
    double calculateSalary()
    {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee
{
    double hourlyRate;
    int hourWorked;
    PartTimeEmployee(int id,String name,double hourlyRate,int hourWorked)
    {
        super(name,id);
        this.hourlyRate=hourlyRate;
        this.hourWorked=hourWorked;
    }
    double calculateSalary()
    {
        return hourlyRate*hourWorked;
    }
}
