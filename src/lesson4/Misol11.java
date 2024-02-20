package lesson4;

import java.util.Scanner;

public class Misol11 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int arrEndSmall[]=new int[n];

        for (int i = 0; i < n; i++) {
            arrEndSmall[i]=scanner.nextInt();
        }

        int count=0;
        for (int i = 0; i < n; i++) {
            if(arrEndSmall[i]<arrEndSmall[n-1]){
                System.out.println(arrEndSmall[i]);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(0);
        }
    }
}
