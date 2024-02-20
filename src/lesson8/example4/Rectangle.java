package lesson8.example4;

public class Rectangle extends Shape{

    public Rectangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    double getPerimetr() {
        return 2*(getSide1()+getSide2());
    }

    @Override
    double getSqurea() {
        return getSide1()*getSide2();
    }

    @Override
    double getSideCount() {
        return 4;
    }
}
