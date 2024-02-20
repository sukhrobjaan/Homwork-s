package lesson4;

import java.util.Scanner;

public class Misol_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrCoupleIndexSmall = new int[n];
        for (int i = 0; i < n; i++) {
            arrCoupleIndexSmall[i] = scanner.nextInt();
        }
        System.out.println(arrCoupleIndexSmall(arrCoupleIndexSmall, n));
    }

    private static int arrCoupleIndexSmall(int[] arrCoupleIndexSmall, int n) {
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i == 0) min = arrCoupleIndexSmall[i];
            if (i % 2 == 0 && arrCoupleIndexSmall[i] < min) min = arrCoupleIndexSmall[i];
        }
        return min;
    }
}
