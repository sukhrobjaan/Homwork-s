package lesson15.example1;

import lesson15.example1.AnimalEnums;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean t = true;
        while (t) {
            System.out.println(" Xush kelibsiz  ");

            System.out.println(" Sizga qanaqa hayvon golisovoyi kerak  ");
            System.out.println("1 Dog (it)");
            System.out.println("2 Cat (mushuk)");
            System.out.println("3 Hooster (xo'roz)");
            System.out.println("5 Cow (sigir)");
            System.out.println("4 Lower (quy)");
            System.out.println("6 Horse (ot)");
            System.out.println("7 CLOSE ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.DOG + " golis Wow wow wow wow");
                    System.out.println(" ---------------------------------");
                    break;
                case 2:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.CAT + " golis Miyaw miyaw");
                    System.out.println(" ---------------------------------");
                    break;
                case 3:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.ROOSTER + " golis Quqqiri quuuuuqq");
                    System.out.println(" ---------------------------------");
                    break;
                case 4:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.COW + " golis Muuuwww muuuwwww");
                    System.out.println(" ---------------------------------");
                    break;
                case 5:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.LOWER + " golis  Baaaa baaaa");
                    System.out.println(" ---------------------------------");

                    break;
                case 6:
                    System.out.println(" Siz tanlagan hayvon  " + AnimalEnums.HORSE + " golis Heiii heiii");
                    System.out.println(" ---------------------------------");
                    break;
                case 7:
                    t = false;
                    System.out.println(" Biz sizga yordam bera oldek deb o'ylaymiz \n Bizni xizmatdan foydalanganiz uchun raxmat");
                    break;
            }
        }


    }
}
