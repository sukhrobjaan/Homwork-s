package lesson4;

import java.util.Scanner;

public class Misol_6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arrEndSmall=new int[n];
        for (int i = 0; i < n; i++) {
            arrEndSmall[i]=scanner.nextInt();
        }
        System.out.println(arrEndSmall(arrEndSmall, n));
    }

    private static int arrEndSmall(int[] arrEndSmall, int n) {
        for (int i = 0; i < n; i++) {
            if(arrEndSmall[i]<arrEndSmall[n-1])return arrEndSmall[i];
        }
        return 0;
    }
}
