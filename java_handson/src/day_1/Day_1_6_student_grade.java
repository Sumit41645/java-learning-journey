package day_1;
import java.util.Scanner;
public class Day_1_6_student_grade
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks for math");
        int math=sc.nextInt();
        System.out.println("enter marks for account");
        int account=sc.nextInt();
        System.out.println("enter marks for science");
        int science=sc.nextInt();
        if(math>100 || account>100 || science>100 || math<0 || account<0 || science<0)
        {
            System.out.println("enter valid marks");
            System.exit(0);
        }
        if(math<35 || science<35 || account<35)
        {

            System.out.println("Fail");

        }
        else {
            float avg = (float) (math + account + science) / 3;
            System.out.println("Average marks : "+avg);
            if (avg >= 90)
            {
                System.out.println("Grade : Excellent");
            }
            else if (avg >= 75 && avg < 90)
            {
                System.out.println("Grade : Very Good");
            }
            else if (avg >= 60 && avg < 75)
            {
                System.out.println("Grade : Good");
            }
            else
            {
                System.out.println("Grade : Needs Improvement");
            }

        }
    }
}

