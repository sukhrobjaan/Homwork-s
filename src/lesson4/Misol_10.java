package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrTheSame = new int[n];
        for (int i = 0; i < n; i++) {
            arrTheSame[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(theSame(arrTheSame, n)));
    }

    private static int[] theSame(int[] arrTheSame, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arrTheSame[i] == arrTheSame[j]) arrTheSame[j] = 0;
                
            }
        }
        int[] arr = Arrays.stream(arrTheSame).filter(value -> value != 0).toArray();
        return arr;

    }
}
