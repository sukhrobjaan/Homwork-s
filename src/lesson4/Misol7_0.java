package lesson4;

import java.util.Scanner;

public class Misol7_0 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[]arrJuft=new int[n];
        for (int i = 0; i < n; i++) {
            arrJuft[i]=scanner.nextInt();
        }
        int kichik = 0;
        for (int i = 0; i < n; i++) {
            if(i==0){
                kichik=arrJuft[i];
            }
            if(i%2==0&& kichik>arrJuft[i]) kichik=arrJuft[i];
        }
        System.out.println(kichik);
    }
}
