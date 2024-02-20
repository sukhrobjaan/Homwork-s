package lesson4;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Misol12 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arrA[]=new int[n];
        int arrB[]=new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arrA[i]<5)
                arrB[i]=arrA[i]*2;
            else arrB[i]=arrA[i]/2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrB[i]+" ");
        }
    }
}
