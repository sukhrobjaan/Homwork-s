package lesson7.example_2;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        MathAssistent mathAssistent=new MathAssistent(number);
        int degree=scanner.nextInt();
        System.out.println(mathAssistent.pow(degree));
        System.out.println(mathAssistent.summDigitNumber());


    }
}
