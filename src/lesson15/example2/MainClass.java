package lesson15.example2;

import lesson15.example2.EnumsClass;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        boolean t = true;
        while (t) {
            System.out.println(" Hush kelibsz ");
            System.out.println(" Sizga qanaqa oyni ma'lumotlari kerak ");
            System.out.println("1  Yanvar  ");
            System.out.println("2  Fevral   ");
            System.out.println("3  Mart   ");
            System.out.println("4  Aprel  ");
            System.out.println("5  May  ");
            System.out.println("6  Iyun   ");
            System.out.println("7  Iyul   ");
            System.out.println("8  Avgust  ");
            System.out.println("9  Setabr  ");
            System.out.println("10 Oktabr   ");
            System.out.println("11 Noyabr   ");
            System.out.println("12 Dekabr  ");
            System.out.println("13 CLOSE  ");
            System.out.println("14 Oy nomini uzgartirish  ");

            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    EnumsClass enumsClass1 = EnumsClass.YANVAR;
                    System.out.println("Siz tanlagan oy " + enumsClass1);
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    EnumsClass enumsClass2 = EnumsClass.FEVRAL;
                    System.out.println("Siz tanlagan oy  " + enumsClass2);
                    System.out.println("-----------------------------------");
                    break;
                case 3:
                    EnumsClass enumsClass3 = EnumsClass.MART;
                    System.out.println("Siz tanlagan oy " + enumsClass3);
                    System.out.println("-----------------------------------");
                    break;
                case 4:
                    EnumsClass enumsClass4 = EnumsClass.APREL;
                    System.out.println("Siz tanlagan oy " + enumsClass4);
                    System.out.println("-----------------------------------");
                    break;
                case 5:
                    EnumsClass enumsClass5 = EnumsClass.MAY;
                    System.out.println("Siz tanlagan oy " + enumsClass5);
                    System.out.println("-----------------------------------");
                    break;
                case 6:
                    EnumsClass enumsClass6 = EnumsClass.IYUN;
                    System.out.println("Siz tanlagan oy  " + enumsClass6);
                    System.out.println("-----------------------------------");
                    break;
                case 7:
                    EnumsClass enumsClass7 = EnumsClass.IYUL;
                    System.out.println("Siz tanlagan oy " + enumsClass7);
                    System.out.println("-----------------------------------");
                    break;
                case 8:
                    EnumsClass enumsClass8 = EnumsClass.AVGUST;
                    System.out.println("Siz tanlagan oy " + enumsClass8);
                    System.out.println("-----------------------------------");
                    break;
                case 9:
                    EnumsClass enumsClass9 = EnumsClass.SENTABR;
                    System.out.println("Siz tanlagan oy  " + enumsClass9);
                    System.out.println("-----------------------------------");
                    break;
                case 10:
                    EnumsClass enumsClass10 = EnumsClass.OKTABR;
                    System.out.println("Siz tanlagan oy  " + enumsClass10);
                    System.out.println("-----------------------------------");
                    break;
                case 11:
                    EnumsClass enumsClass11 = EnumsClass.NOYABR;
                    System.out.println("Siz tanlagan oy " + enumsClass11);
                    System.out.println("-----------------------------------");
                    break;
                case 12:
                    EnumsClass enumsClass12 = EnumsClass.DEKABR;
                    System.out.println("Siz tanlagan oy " + enumsClass12);
                    System.out.println("-----------------------------------");
                    break;
                case 13:
                    t = false;
                    System.out.println("Bizni Ma'limotlar sizga yoqdi deb o'ylamiz");
                    break;
                case 14:
                    boolean t_true = true;
                    while (t_true) {
                        System.out.println(" Hush kelibsz ");
                        System.out.println(" Sizga qanaqa oyni ma'lumotlari uzgargan holda bilmoqchisz  (Jurnalistlar oylar nomini quyidagicha o‘zgartirishni taklif qildi) ");
                        System.out.println("101  Yanvar  ");
                        System.out.println("102  Fevral   ");
                        System.out.println("103  Mart   ");
                        System.out.println("104  Aprel  ");
                        System.out.println("105  May  ");
                        System.out.println("106  Iyun   ");
                        System.out.println("107  Iyul   ");
                        System.out.println("108  Avgust  ");
                        System.out.println("109  Setabr  ");
                        System.out.println("110  Oktabr   ");
                        System.out.println("111  Noyabr   ");
                        System.out.println("112  Dekabr  ");
                        System.out.println("113  EXIT  14  ");

                        int b = scanner.nextInt();
                        switch (b) {
                            case 101:
                                EnumsClass enumsClass101 = EnumsClass.NEWYANVAR;
                                System.out.println("Siz tanlagan oy " + enumsClass101 + " - Vatan ");
                                System.out.println("-----------------------------------");
                                break;
                            case 102:
                                EnumsClass enumsClass102 = EnumsClass.NEWFEVRAL;
                                System.out.println("Siz tanlagan oy " + enumsClass102 + " - Navoiy ");
                                System.out.println("-----------------------------------");
                                break;
                            case 103:
                                EnumsClass enumsClass103 = EnumsClass.NEWMART;
                                System.out.println("Siz tanlagan oy " + enumsClass103 + " - Mirzo Ulug‘bek");

                                System.out.println("-----------------------------------");
                                break;
                            case 104:
                                EnumsClass enumsClass104 = EnumsClass.NEWAPREL;
                                System.out.println("Siz tanlagan oy " + enumsClass104 + " - Amir Temur");
                                System.out.println("-----------------------------------");
                                break;
                            case 105:
                                EnumsClass enumsClass105 = EnumsClass.NEWMAY;
                                System.out.println("Siz tanlagan oy " + enumsClass105 + " – Xorazmiy ");
                                System.out.println("-----------------------------------");
                                break;
                            case 106:
                                EnumsClass enumsClass106 = EnumsClass.NEWIYUN;
                                System.out.println("Siz tanlagan oy " + enumsClass106 + " – Zulfiya ");
                                System.out.println("-----------------------------------");
                                break;
                            case 107:
                                EnumsClass enumsClass107 = EnumsClass.NEWIYUL;
                                System.out.println("Siz tanlagan oy " + enumsClass107 + " – Buxoriy");
                                System.out.println("-----------------------------------");
                                break;
                            case 108:
                                EnumsClass enumsClass108 = EnumsClass.NEWAVGUST;
                                System.out.println("Siz tanlagan oy " + enumsClass108 + " – Buxoriy ");
                                System.out.println("-----------------------------------");
                                break;
                            case 109:
                                EnumsClass enumsClass109 = EnumsClass.NEWSENTABR;
                                System.out.println("Siz tanlagan oy " + enumsClass109 + " – Beruniy");
                                System.out.println("-----------------------------------");
                                break;
                            case 110:
                                EnumsClass enumsClass110 = EnumsClass.NEWOKTABR;
                                System.out.println("Siz tanlagan oy " + enumsClass110 + " – Farg‘oniy ");
                                System.out.println("-----------------------------------");
                                break;
                            case 111:
                                EnumsClass enumsClass111 = EnumsClass.NEWNOYABR;
                                System.out.println("Siz tanlagan oy " + enumsClass111 + "  - Jaloliddin Manguberdi");
                                System.out.println("-----------------------------------");
                                break;
                            case 112:
                                EnumsClass enumsClass112 = EnumsClass.NEWDEKABR;
                                System.out.println("Siz tanlagan oy " + enumsClass112 + " - Avesto");
                                System.out.println("-----------------------------------");
                                break;
                            case 113:
                                t_true = false;
                                break;
                        }
                    }

            }
        }
    }

}

