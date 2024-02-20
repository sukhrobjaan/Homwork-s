package lesson4;

import java.util.Scanner;

public class Misol2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        boolean t=true;
        while (t) {
            String satr = scanner.next();
            t=false;
            switch (satr) {
                case "Qish":
                    System.out.println("dekabr ,  yanvar , febral");
                    break;
                case "Bahor":
                    System.out.println("mart ,  aprel , may");
                    break;
                case "Yoz":
                    System.out.println("iyun ,  iyul , avgust");
                    break;
                case "Kuz":
                    System.out.println("sentyabr ,  oktyabr , noyabr");
                    break;
                default:
                    System.out.println("Bosh harif bilan kirting satrni");
                    t=true;
            }
        }
    }
}
