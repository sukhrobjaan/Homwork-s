package lesson16.example5;

public class Rectange implements Shape {


    int a;
    int b;

    public Rectange(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {

        return 2 * (a + b);
    }

    @Override
    public double getSquare() {
        return a * b;

    }
}
