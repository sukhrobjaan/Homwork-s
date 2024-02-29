package lesson16.example2;

import java.util.Arrays;

public class Basket {
    private int maxWeight;
    private int count = 0;

    Fruit[] fruits = new Fruit[1000];
    int max = 0;

    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
        max = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    boolean isEmpty() {
        return getMaxWeight() == 0;
    }

    boolean isFull() {
        return getMaxWeight() == max;
    }

    boolean addFruit(Fruit fruit) {
        if (getMaxWeight() >= fruit.getFruitWeight()) {
            fruits[count++] = fruit;
            setMaxWeight(getMaxWeight() - fruit.getFruitWeight());
            return false;
        }
        return false;
    }

    int getEmptySize() {
        return getMaxWeight();
    }

    public final void showInfo() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < count; i++) {
            System.out.println("Fruit Name -> " + fruits[i].getFruitName());
            System.out.println("Fruit Color -> " + fruits[i].getFruitColor());
            System.out.println("Fruit Weight -> " + fruits[i].getFruitWeight());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }

    boolean addFruit(Fruit[] fruits1) {
        int s = 0;
        for (int i = 0; i < fruits1.length; i++) {
            s += fruits1[i].getFruitWeight();
        }
        if (getMaxWeight() >= s) {
            for (int i = 0; i < fruits1.length; i++) {
                fruits[count++] = fruits1[i];
            }
            return true;
        }
        System.out.println("The fruit did not fit in the basket");    //Meva sig'madi savatga
        return false;
    }

}
