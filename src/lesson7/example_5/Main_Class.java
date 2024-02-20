package lesson7.example_5;

import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kasrni suratini kiriting = ");
        int a = scanner.nextInt();
        System.out.print("Kasrni maxrajini kiriting = ");
        int b = scanner.nextInt();
        Kasr kasr = new Kasr(a, b);


        kasr.showInfo();
        System.out.println("----------------------");
        System.out.print("Birinchi kasrni suratini kiriting = ");
        int surat = scanner.nextInt();
        System.out.print("Birinchi kasrni maxrjini kiriting = ");
        int maxraj = scanner.nextInt();
        System.out.print("Ikkinchi kasrni suratini kiriting = ");
        int surat2 = scanner.nextInt();
        System.out.print("Ikkinichi kasrni maxrjini kiriting = ");
        int maxraj2 = scanner.nextInt();
        kasr.addTwoKasr(surat, maxraj, surat2, maxraj2);

        System.out.print("Birinchi kasrni suratini kiriting = ");
        surat = scanner.nextInt();
        System.out.print("Birinchi kasrni maxrjini kiriting = ");
        maxraj = scanner.nextInt();
        System.out.print("Ikkinchi kasrni suratini kiriting = ");
        surat2 = scanner.nextInt();
        System.out.print("Ikkinichi kasrni maxrjini kiriting = ");
        maxraj2 = scanner.nextInt();
        kasr.multiplyTwoKasr(surat, maxraj, surat2, maxraj2);

        System.out.print("Birinchi kasrni suratini kiriting = ");
        surat = scanner.nextInt();
        System.out.print("Birinchi kasrni maxrjini kiriting = ");
        maxraj = scanner.nextInt();
        System.out.print("Ikkinchi kasrni suratini kiriting = ");
        surat2 = scanner.nextInt();
        System.out.print("Ikkinichi kasrni maxrjini kiriting = ");
        maxraj2 = scanner.nextInt();
        kasr.divisionTwoKasr(surat, maxraj, surat2, maxraj2);
    }
}
