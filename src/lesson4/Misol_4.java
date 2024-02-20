package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[]arrAscIndex=new int[n];
        for (int i = 0; i < n; i++) {
            arrAscIndex[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrAscIndex(arrAscIndex, n, k)));
    }

    private static int[] arrAscIndex(int[] arrAscIndex, int n, int k) {
        int a=arrAscIndex[k];
        for (int i = 0; i < n; i++) {
            arrAscIndex[i]+=a;
        }
        return arrAscIndex;
    }
}
