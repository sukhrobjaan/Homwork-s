package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arrJuft=new int[n];
        for (int i = 0; i < n; i++) {
            arrJuft[i]=scanner.nextInt();
        }
        arrJuftIndex(arrJuft, n);
    }

    private static void arrJuftIndex(int[] arrJuft, int n) {
        for (int i = n-1; i >= 0; i--) {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
