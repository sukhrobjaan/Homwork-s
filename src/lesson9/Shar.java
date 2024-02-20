package lesson9;

public class Shar extends Shakil {
    float a;
    float b;

    public Shar(float a) {
        super(a);
        this.a=a;
    }

    public Shar(float a, float b) {
        super(a, b);
        this.a=a;
        this.b=b;

    }
    

    @Override
    double perimetr() {
        System.out.println("Hello World!");
        return ((4 / 3) * Math.PI * a * a);
    }

    @Override
    double yuza() {
        return (Math.PI * a * a * a);
    }

}
