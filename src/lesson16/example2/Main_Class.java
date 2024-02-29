package lesson16.example2;

public class Main_Class {
    public static void main(String[] args) {
        Apple apple = new Apple("olma", "qizil", 200);

        Basket basket = new Basket(2000);
        System.out.println("Basket is Empty -> " + basket.isEmpty());
        System.out.println("Basket is Full -> " + basket.isFull());

        System.out.println("add Fruit -> " + basket.addFruit(apple));
        System.out.println("add Fruit -> " + basket.addFruit(apple));
        System.out.println("add Fruit -> " + basket.addFruit(apple));

        System.out.println("Empty basket -> " + basket.getEmptySize());


        Apple apple1 = new Apple("olma", "qizil", 200);
        Peach peach = new Peach("behi", "sariq", 75);
        Pomegranate pomegranate = new Pomegranate("pamidor", "qizil", 125);
        Fruit[] fruits = {apple, apple1, pomegranate, peach, pomegranate, peach};
        System.out.println("add fruits to the basket -> " + basket.addFruit(fruits));

        basket.showInfo();


    }
}
