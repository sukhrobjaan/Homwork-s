package lesson14;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        while (t) {
            System.out.println("Hush kelibsz ");
            System.out.println("qanaqa Hizmatdan faydalanmaoqchisz ");
            System.out.println("1 karta buyrtma qilish  ");
            System.out.println("2 karta uchirish   ");
            System.out.println("3 qushimcha hizmatlar   ");
            System.out.println("4 CLOSE  ");

            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Qanaqa karta buyirtma qilasz ");
                    System.out.println("1 uzcard  ");
                    System.out.println("2 Humo   ");
                    System.out.println("3 Visa ");
                    int card = scanner.nextInt();
                    switch (card) {
                        case 1:
                            BankCarta bankCarta = BankCarta.UZCARD;
                            System.out.println("Siz buyirtima bergan karta nomi = " + bankCarta);
                            break;
                        case 2:
                            BankCarta bankCarta1 = BankCarta.HUMO;
                            System.out.println("Siz buyirtima bergan karta nomi = " + bankCarta1);
                            break;
                        case 3:
                            BankCarta bankCarta2 = BankCarta.VISA;
                            System.out.println("Siz buyirtima bergan karta nomi = " + bankCarta2);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Qanaqa karta ochirasz ");
                    System.out.println("1 uzcard  ");
                    System.out.println("2 Humo   ");
                    System.out.println("3 Visa ");
                    break;
                case 3:
                    System.out.println("qushimcha hizmatlardan faydalanganiz uchun raxmat");
                    break;
                case 4:
                    t = false;
                    break;
            }
        }
    }

}
