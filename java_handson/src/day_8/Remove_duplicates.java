package day_8;
import java.util.Scanner;
public class Remove_duplicates
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        int index=0;

        char [] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            boolean flag=true;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                  flag=false;
                  break;
                }
            }
            if(flag) {
                arr[index] = arr[i];
                index++;

            }
        }
        str=new String(arr,0,index);
        System.out.println(str);
    }
}

