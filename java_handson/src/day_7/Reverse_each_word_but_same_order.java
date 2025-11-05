package day_7;
import java.util.Scanner;
public class Reverse_each_word_but_same_order
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String word=sc.nextLine();
        String [] str=word.split(" ");
        for(int i=0;i<str.length;i++)
        {
            String wor=str[i];
            int start=0;
            int end=wor.length()-1;
            char [] ch=wor.toCharArray();
            while(start<end)
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
            wor=new String(ch);
            str[i]=wor;
        }
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}

