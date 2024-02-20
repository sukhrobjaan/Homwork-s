package lesson4;

import java.util.Scanner;

public class Misol7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[]arrIndex=new int[n];

        for (int i = 0; i < n; i++) {
            arrIndex[i]=scanner.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            if(i%2==0) System.out.print(i+" ");
        }
    }
}
