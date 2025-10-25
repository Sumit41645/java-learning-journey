package DAY_1;
import java.util.Scanner;
public class day_1_operations
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        if(args.length>=2)
        {
            System.out.println("command line");
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println("Addition "+(a+b));
            System.out.println("Subtraction "+(a-b));
            System.out.println("Multiplication "+(a*b));
            System.out.println("Division "+(a/b));
        }
        else
        {
            System.out.println("Scanner class");
            System.out.println("First input");
            int a=sc.nextInt();
            System.out.println("second input");
            int b=sc.nextInt();
            System.out.println("Addition "+(a+b));
            System.out.println("Subtraction "+(a-b));
            System.out.println("Multiplication "+(a*b));
            System.out.println("Division "+(a/b));
            sc.close();
        }
    }
}
