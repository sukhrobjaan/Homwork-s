package lesson3;

import java.util.Scanner;

public class Misol3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();

        str=str.toLowerCase();

        String teskari=new StringBuilder(str).reverse().toString();

        String[] arr=teskari.split("");

        arr[0]=arr[0].toUpperCase();

        teskari=String.join("",arr);

        System.out.println(teskari);

    }
}
