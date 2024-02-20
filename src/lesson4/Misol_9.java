package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_9 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[]arrDeleteIndex=new int[n];
        for (int i = 0; i < n; i++) {
            arrDeleteIndex[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(deleteIndex(arrDeleteIndex, n, k)));
    }

    private static int[] deleteIndex(int[] arrDeleteIndex, int n, int k) {

        int[]arr=new int[n-1];
        int count=0;
        for (int i = 0; i < n; i++) {
            if(k==i)continue;
            arr[count++]=arrDeleteIndex[i];
        }
        return arr;
    }
}
