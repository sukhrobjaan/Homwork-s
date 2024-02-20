package lesson6;

public class Main {
    public static void main(String[] args) {

        Tringle tringle=new Tringle();
        tringle.a=3;
        tringle.b=4;
        tringle.c=5;
        System.out.println(tringle.perimetrTringle());
        System.out.println(tringle.surfaceTringle());
    }
}