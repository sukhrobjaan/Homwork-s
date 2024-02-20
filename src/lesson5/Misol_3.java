package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(getJuftToq(arr)));
    }

    private static int[] getJuftToq(int arr[]) {
        int[] a = new int[arr.length];
        int count = 0;
        for (int i : getJuft(arr)) {
            a[count++] = i;
        }
        for (int i : getToq(arr)) {
            a[count++] = i;
        }
        return a;
    }

    private static int[] getJuft(int[] arr) {

        int a[] = new int[arr.length];
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                a[count++] = value;
            }
        }
        return a;
    }

    private static int[] getToq(int[] arr) {

        int a[] = new int[arr.length];
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                a[count++] = value;
            }
        }
        return a;
    }

    private static int[] getSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        return a;
    }


}
