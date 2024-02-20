package lesson8.example4;

public  class Circle extends Shape {

    public Circle(double side1) {
        super(side1);
    }

    @Override
    double getPerimetr() {
        return 2*Math.PI*getSide1();
    }

    @Override
    double getSqurea() {
        return Math.PI*getSide1()*getSide1();
    }

    @Override
    double getSideCount() {
        return 0;
    }
}
