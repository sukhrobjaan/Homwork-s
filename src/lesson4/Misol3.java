package lesson4;

import java.util.Scanner;

public class Misol3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }

        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < n; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        System.out.println("min => "+min);
        System.out.println("max => "+max);
    }
}
