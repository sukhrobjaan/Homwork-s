package lesson8.example2;

public class Basket {

    int maxWeight;
    int summ = 0;
    int sum = 0;

    int count = 0;
    Fruit[] fruits = new Fruit[100];

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Basket(int maxWeight) {
        this.maxWeight = maxWeight;
        summ = maxWeight;
    }

    boolean isFull() {
        return getMaxWeight() == 0;
    }

    boolean isEmpty() {
        return getMaxWeight() == summ;
    }

    void addFruit(Fruit fruit) {
        if (getMaxWeight() >= fruit.weight) {
            fruits[count++] = fruit;
            sum += fruit.weight;
            setMaxWeight(getMaxWeight()-fruit.weight);
        }
    }

    void showMessage(String message) {
        System.out.println("Fruit Name " + message);
        System.out.println("#############################");
    }

    void addFruits(Fruit[] fruits1) {
        int a = 0;
        for (int i = 0; i < fruits1.length; i++) {
            a += fruits1[i].weight;
        }
        if (getMaxWeight() >= a) {
            for (int i = 0; i < fruits1.length; i++) {
                fruits[count++] = fruits1[i];
            }
        } else {
            int s=0;
            int f=0;
            for (int k = fruits1.length-1; k >= 0; k--) {
                s+=fruits1[k].weight;
                f++;
                if(a-getMaxWeight()<s){
                    break;
                }
            }
            for (int i = 0; i < fruits1.length-f; i++) {
                fruits[count++]=fruits1[i];
            }
            for (int i = fruits1.length-f; i < fruits1.length; i++) {
                showMessage(fruits1[i].fruitName);
            }
            System.out.println();
        }
    }

    void showFruits() {
        for (int i = 0; i < count; i++) {
            System.out.println("Fruit Name " + fruits[i].fruitName);
            System.out.println("Fruit Color " + fruits[i].fruitColor);
            System.out.println("Fruit weight " + fruits[i].weight);
            System.out.println("_______________________________");
        }
    }


}
