package lesson2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        java.lang.String num=scanner.next();
        java.lang.String num1=scanner.next();
        num=num.toLowerCase();
        num1=num1.toLowerCase();
        if(num.equals(num1))
            System.out.println("Bir xil");
        else System.out.println("Har xil");
    }
}