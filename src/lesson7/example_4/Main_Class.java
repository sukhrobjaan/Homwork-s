package lesson7.example_4;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("mulkni kiriting =");
        int milk = scanner.nextInt();
        System.out.print("sugarni kiritirng =");
        int sugar = scanner.nextInt();

        MakeIceCream makeIceCream = new MakeIceCream(milk, sugar);
        System.out.print("add milkni kiriting =");
        int a = scanner.nextInt();
        System.out.print("add sugarni kiriting =");
        int b = scanner.nextInt();

        makeIceCream.addMilk(a);
        makeIceCream.addSugar(b);

        makeIceCream.showInfo();

        System.out.print("bitta musqaymoqni tayyorlash uchun qancha milk kitadi = ");
        a = scanner.nextInt();
        System.out.print("bitta musqaymoqni tayyorlash uchun qancha sugar kitadi = ");
        b = scanner.nextInt();
        System.out.println(makeIceCream.maxIceCreamCount(a, b)+"  hozirgi vaqtda shuncha musqaymoq tayyorlasa buladi");

        System.out.print("nechta musqaymoq tayyorlash kerak sonini kiritirng =");
        int count = scanner.nextInt();
        makeIceCream.makeIceCream(a,b,count);

    }
}
