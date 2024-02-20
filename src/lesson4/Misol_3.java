package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]arrAsc=new int[n];
        for (int i=0;i<n;i++) {
            arrAsc[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrAsc(arrAsc,n)));
    }

    private static int[] arrAsc(int[] arrAsc, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arrAsc[i]<arrAsc[j]){
                    int tepm=arrAsc[i];
                    arrAsc[i]=arrAsc[j];
                    arrAsc[j]=tepm;
                }
            }
        }
        return arrAsc;
    }

}
