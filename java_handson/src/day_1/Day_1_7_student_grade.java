package day_1;
import java.util.Scanner;
public class Day_1_7_student_grade
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many students you want");
        int n=sc.nextInt();
        String [] str=new String[n];
        System.out.println("enter name of Students one by one");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("enter marks for "+str[i]);
            System.out.print("Maths = ");
            int Maths=sc.nextInt();

            System.out.print("Science = ");
            int Science=sc.nextInt();

            System.out.print("Accounts = ");
            int Accounts=sc.nextInt();
            if(Maths<0 || Science<0 || Accounts<0 || Maths>100 || Science>100 || Accounts>100)
            {
                System.out.println("invalid marks (hint:marks should be between 0-100)");
                System.exit(0);
            }
            else
            {
                float avg=(float)(Maths+Science+Accounts)/3;
                System.out.println("Percentage = "+avg);
                if(Maths<35 || Science<35 || Accounts<35)
                {
                    System.out.println("your are fail");
                }
                else if(avg>90)
                {
                    System.out.println("Grade = Excellent");
                }
                else if(avg>=75 && avg <90)
                {
                    System.out.println("Grade = Very Good");
                }
                else if(avg>=60 && avg<75)
                {
                    System.out.println("Grade = Good");
                }
                else
                {
                    System.out.println("Need Improvement");
                }
            }
        }
    }
}

