package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arrRemove = new int[n];
        int[] arrIndex = new int[n-1];

        for (int i = 0; i < n; i++) {
            arrRemove[i] = scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if (i == k) continue;
            arrIndex[count++] = arrRemove[i];
        }
        System.out.println(Arrays.toString(arrIndex));
//        for (int i = 0; i < n-1; i++) {
//            System.out.print(arrIndex[i] + " ");
//        }


    }
}
