package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[]arrKCarra=new int[n];
        for (int i = 0; i < n; i++) {
            arrKCarra[i]=scanner.nextInt();
        }
        arrKarra(arrKCarra,n,k);
    }

    private static void arrKarra(int[] arrKCarra, int n, int k) {
        for (int i = 0; i < n; i+=k) {
            System.out.print(arrKCarra[i]+" ");
        }
    }
}
