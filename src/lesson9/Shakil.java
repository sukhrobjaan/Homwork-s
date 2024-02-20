package lesson9;

abstract public class Shakil {
    float a;
    float b;
    float c;

    public Shakil(float a) {
        this.a = a;
    }

    public Shakil(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Shakil(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    abstract double perimetr();
    abstract double yuza();


}
