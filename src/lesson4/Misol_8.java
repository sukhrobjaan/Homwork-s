package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arrAsc=new int[n];
        for (int i = 0; i < n; i++) {
            arrAsc[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrAsc(arrAsc, n)));
    }

    private static int[] arrAsc(int[] arrAsc, int n) {
        for (int i = 0; i < n; i++) {
            if(arrAsc[i]<5)arrAsc[i]=arrAsc[i]*2;
            else arrAsc[i]=arrAsc[i]/2;
        }
        return arrAsc;
    }
}
