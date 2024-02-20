package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int s=0;
        while (n>0){
            s+=n%10;
            n/=10;
        }
        System.out.println(s);

        int m=scanner.nextInt();
        int s1=0;
        while (m>0){
            int a=m%10;
            s1=s1*10+a;
            m/=10;
        }

        System.out.println(s1);




    }

}