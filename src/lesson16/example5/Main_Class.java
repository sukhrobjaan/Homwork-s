package lesson16.example5;

public class Main_Class {
    public static void main(String[] args) {


        Rectange rectange = new Rectange(10, 45);
        System.out.println("Perimetor -> " + rectange.getPerimetr());
        System.out.println("Square -> " + rectange.getSquare());



        Rectange rectange1=new Rectange(10,5);
        System.out.println("Perimetor -> " + rectange1.getPerimetr());
        System.out.println("Square -> " + rectange1.getSquare());


        Triangle triangle=new Triangle(3,4,5);
        System.out.println("Perimetor -> " + triangle.getPerimetr());
        System.out.println("Perimetor -> " + triangle.getPerimetr());

        Triangle triangle1=new Triangle(300,400,500);
        System.out.println(triangle1.getPerimetr());
        System.out.println(triangle1.getSquare());
    }
}
