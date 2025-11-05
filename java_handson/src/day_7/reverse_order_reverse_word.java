package day_7;
import java.util.Scanner;
public class reverse_order_reverse_word
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String word=sc.nextLine();
        String [] str=word.split(" ");
        int start=0;
        int end=str.length-1;
        while(start<end)
        {
            String temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<str.length;i++)
        {
            int beg=0;
            int last=str[i].length()-1;
            char [] wor=str[i].toCharArray();
            while(beg<last)
            {
                char temp=wor[beg];
                wor[beg]=wor[last];
                wor[last]=temp;
                beg++;
                last--;
            }
            str[i]=new String(wor);
        }
        for(String s:str)
        {
            System.out.print(s+" ");
        }
    }
}

