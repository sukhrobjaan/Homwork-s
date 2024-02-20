package lesson4;

import java.util.Scanner;

public class Misol10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int carra=scanner.nextInt();
        int arrCarra[]=new int[n];

        for (int i = 0; i < n; i++) {
            arrCarra[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i%carra==0) System.out.print(arrCarra[i]+" ");
        }

    }
}
