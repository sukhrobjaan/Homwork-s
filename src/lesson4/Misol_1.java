package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayCount(arr,n)));
    }

    private static int[] arrayCount(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]+2;
        }
        return arr;
    }

}
