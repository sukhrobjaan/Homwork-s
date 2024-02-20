package lesson2;

import java.util.Scanner;

public class misol2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        java.lang.String num=scanner.next();
        java.lang.String num1=scanner.next();

        num=num.toLowerCase();
        num1=num1.toLowerCase();

        num=num.replace("a","");
        num=num.replace("o","");
        num=num.replace("u","");
        num=num.replace("i","");
        num=num.replace("e","");
        num1=num1.replace("a","");
        num1=num1.replace("o","");
        num1=num1.replace("u","");
        num1=num1.replace("i","");
        num1=num1.replace("e","");

        if(num.equals(num1))
            System.out.println("Bir xil");
        else System.out.println("Har xil");
    }
}
