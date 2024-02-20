package lesson7.example_3;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        Assistent assistent = new Assistent();
        System.out.println(assistent.addTwoNumber(a, b));
        System.out.println(assistent.pow(a, b));
        System.out.println(assistent.abs(a));


        double c = scanner.nextDouble();
        System.out.println(assistent.getWholeSection(c));


    }
}
