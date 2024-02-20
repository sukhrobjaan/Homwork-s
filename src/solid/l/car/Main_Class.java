package solid.l.car;

public class Main_Class {
    public static void main(String[] args) {

        Father father = new Father();
        System.out.println(father.slow() + father.carLight());

        Child child = new Child();
        System.out.println(child.slow() + child.carLight() + child.carLoad());
    }
}
