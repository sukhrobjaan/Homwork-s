package lesson4;

import java.util.Scanner;

public class MIsol6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int []arrCount=new int[n];

        for (int i = 0; i < n; i++) {
            arrCount[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print((arrCount[i]+2)+" ");
        }
    }
}
