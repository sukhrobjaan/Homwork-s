package lesson5;

import java.util.Scanner;

public class Misol_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        arrTub(a, n);
    }

    public static void arrTub(int[] a, int n) {
        int count1 = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j < (a[i] / 2) + 1; j++)
                if (a[i] % j == 0) count++;
            if (count == 1) arr[count1++] = a[i];
        }
            for (int i = 0; i < count1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
