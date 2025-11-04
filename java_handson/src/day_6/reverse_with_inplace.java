package day_6;
import java.util.Scanner;
public class reverse_with_inplace
{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anything");
        String word = sc.nextLine();
        System.out.println("original string " + word);
        int start = 0;
        int end = word.length() - 1;
        char [] arr = word.toCharArray();
        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        word = new String(arr);
        System.out.println("reversed string "+word);
    }
}

