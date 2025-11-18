package day_10;
import java.util.Scanner;
public class Valid_Palindrome_with_At_Most_One_Deletion
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine().toLowerCase();
        char [] arr=str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]==arr[end])
            {
                start++;
                end--;
            }
            else
            {
                int first=0;
                int last=arr.length-1;
               while(first<last)
               {
                  if(first==start)
                  {
                      continue;
                  }
                  if(arr[first]==arr[last])
                  {
                      first++;
                      last--;
                  }
                  
               }
            }
        }
    }
}

