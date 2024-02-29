package lesson19.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KengBurgers kengBurgers = new KengBurgers();


        boolean outer = true;
        while (outer) {
            System.out.println("KenBurger Add");
            System.out.println("1 Burger qo'shish");
            System.out.println("2  CLOSE");
            System.out.print("menu1 =");
            int menu1 = scanner.nextInt();
            switch (menu1) {
                case 1:
                    System.out.println(kengBurgers.add(new HamBurger("kichik Burger", 279, 25_000, 10)));
                    System.out.println(kengBurgers.add(new HamBurger("Sredni Burger", 279, 25_000, 100, 20)));
                    System.out.println(kengBurgers.add(new HamBurger("Katta Burger", 279, 25_000, 100, 80, 12)));
                    System.out.println(kengBurgers.add(new HamBurger("MaxBeg Burger", 279, 25_000, 100, 80, 50, 15)));
                    break;
                case 2:
                    outer = false;
                    break;
            }
        }


        outer = true;
        while (outer) {
            System.out.println("Assalomu alaykum xo'sh kelibsiz");
            System.out.println("Marxamat menu nima bo'yirtirasiz");
            System.out.println("1 Bo'yurtma berish");
            System.out.println("2 Bo'yurtma xisobi");
            System.out.println("3  CLOSE");
            System.out.println("4 malumotlar");
            System.out.print("menu =");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    boolean innerWhile = true;
                    while (innerWhile) {
                        System.out.println("Menular ro'yxati");
                        System.out.println("1 Kichik Burger           (non, go'sht kukat)");
                        System.out.println("2 Sretni Burger           (non, go'sht kukat, pamidor)     ");
                        System.out.println("3 Katta Burger            (non, go'sht kukat, pamidor,sir)       ");
                        System.out.println("4 Maxbeg Burger           (non, go'sht kukat, pamidor,sir,salatlar) ");
                        System.out.println("5 Raxmat xisobni bering    ");
                        System.out.println("6 Close Menu                                     maxsulot yetarli");
                        int menu_ruyxat = scanner.nextInt();
                        switch (menu_ruyxat) {
                            case 1:
                                if (kengBurgers.there(new HamBurger("kichik Burger", 279, 25_000, 2)))
                                    kengBurgers.addOrder(new HamBurger("kichik Burger", 279, 35_000, 2));
                                else {
                                    kengBurgers.showInfo("Kichik Burger tugab qolgan ");
                                }
                                break;
                            case 2:
                                if (kengBurgers.there(new HamBurger("Sredni Burger", 279, 45_000, 100, 2)))
                                    kengBurgers.addOrder(new HamBurger("Sredni Burger", 279, 55_000, 100, 2));
                                else {
                                    kengBurgers.showInfo("Sretni Burger tugab qolgan ");
                                }
                                break;
                            case 3:
                                if (kengBurgers.there(new HamBurger("Katta Burger", 279, 25_000, 100, 80, 2)))
                                    kengBurgers.addOrder(new HamBurger("Katta Burger", 279, 25_000, 100, 80, 2));
                                else {
                                    kengBurgers.showInfo("Katta Burger tugab qolgan ");
                                }
                                break;
                            case 4:
                                if (kengBurgers.there(new HamBurger("MaxBeg Burger", 279, 25_000, 100, 80, 50, 2)))
                                    kengBurgers.addOrder(new HamBurger("MaxBeg Burger", 279, 25_000, 100, 80, 50, 2));
                                else {
                                    kengBurgers.showInfo("MaxBeg Burger tugab qolgan ");
                                }
                                break;
                            case 5:
                                kengBurgers.showInfoOrder();
                                break;
                            case 6:
                                innerWhile = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    kengBurgers.showInfoOrder();

                    System.out.println("\nJami -> " + kengBurgers.showCost());
                case 3:
                    outer = false;
                    break;
                case 4:
                    System.out.println(kengBurgers.add(new HamBurger("MaxBeg Burger", 279, 25_000, 100, 80, 50, 2)));
                    kengBurgers.showInfo();
            }
        }
    }
}