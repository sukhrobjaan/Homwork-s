package lesson8.example2;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Basket basket=new Basket(180);

        basket.addFruit(new Fruit("olma","qizil",10));
        basket.addFruit(new Fruit("ananas","ko'k",5));
        basket.addFruit(new Fruit("banana","sariq",20));
        basket.addFruit(new Fruit("anor","qizil",10));
        basket.addFruit(new Fruit("kiwi","ko'k",15));
        basket.addFruit(new Fruit("kiwi","ko'k",15));
        basket.addFruit(new Fruit("kiwi","ko'k",15));
        basket.addFruit(new Fruit("kiwi","ko'k",15));

        System.out.println("isEmpty = "+basket.isEmpty());
        System.out.println("isFull = "+basket.isFull());
        System.out.println();
        basket.addFruits(new Fruit[]{new Fruit("aaaaa","ko'k",10),
                new Fruit("bbbbb","qizil",10),
                new Fruit("ccccccc","sariq",20),
                new Fruit("wwwwwwwwwwww","qqqqqqqqqqq",20),
                new Fruit("jjjjjjjj","qqqqq",20),
                new Fruit("ssssssssss","eeeeeeeeeee",20),
                new Fruit("dddddddddddd","rrrrrrrrrrrr",20)});

        basket.showFruits();
    }
}
