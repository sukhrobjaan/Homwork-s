package lesson8.example4;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        double sile1=scanner.nextDouble();
        double sile2=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(sile1,sile2);

        System.out.println("Rectangle perimetr = "+rectangle.getPerimetr());
        System.out.println("Rectangle yuzasi = "+rectangle.getSqurea());
        System.out.println("Rectangle tomoni = "+rectangle.getSideCount());

        sile1=scanner.nextDouble();
        Circle circle=new Circle(sile1);

        System.out.println("Circle perimetr = "+circle.getPerimetr());
        System.out.println("Circle yuzisi = "+circle.getSqurea());
        System.out.println("Circle tomoni = "+circle.getSideCount());



    }
}
