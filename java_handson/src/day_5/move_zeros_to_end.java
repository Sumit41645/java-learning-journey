package day_5;
import java.util.Scanner;

public class move_zeros_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("normal array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int m = 0;  // current element
        int k = 0;  // position for next non-zero

        while (m < n) {
            if (arr[m] != 0) {
                // swap arr[m] and arr[k]
                int temp = arr[m];
                arr[m] = arr[k];
                arr[k] = temp;
                k++;
            }
            m++;
        }

        System.out.println("\nafter moving zeros:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
