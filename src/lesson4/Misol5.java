package lesson4;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int s=0;
        for (int i = 0; i < n; i++) {
            s+=arr[i];
        }
        System.out.println("elementlar summsi =>"+s);
    }
}
