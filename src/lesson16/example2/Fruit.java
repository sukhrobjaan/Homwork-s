package lesson16.example2;

public abstract class Fruit {

    private String fruitName;
    private String fruitColor;
    private int fruitWeight;

    public Fruit(String fruitName, String fruitColor, int fruitWeight) {
        this.fruitName = fruitName;
        this.fruitColor = fruitColor;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public int getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(int fruitWeight) {
        this.fruitWeight = fruitWeight;
    }



}
