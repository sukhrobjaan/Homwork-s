package lesson6;

public class Tringle {
    double a;
    double b;
    double c;
    public double surfaceTringle(){
        return (double) Math.sqrt(perimetrTringle()/2*(perimetrTringle()/2-a)*(perimetrTringle()/2-b)*(perimetrTringle()/2-c));
    }
    public double perimetrTringle(){
        return a+b+c;
    }

}
