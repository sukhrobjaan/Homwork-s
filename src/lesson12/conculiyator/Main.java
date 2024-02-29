package lesson12.conculiyator;

import lesson12.conculiyator.Arfimetik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Arfimetik arfimetik = new Arfimetik();


        System.out.print("1  qiymatni kiriting = ");
        double a = scanner.nextInt();
        System.out.println("  pow2  |  pow3   |  + \n  sqrt2 |  sqrt3  |  - \n  sinx  |  cosx   |  * \n  %     |  1/X    |  / \n  C     |  clear  |  null ");
        System.out.print("Amalni kiriting = ");
        String amal = scanner.next();
        double b = 0;
        boolean t = true;
        int count = 2;
        double c = a;
        while (t) {


            if ((amal == "+" || amal == "-" | amal == "*" | amal == "/") && (!amal.equals("null"))) {
                System.out.print(count + "  qiymatni kiriting = ");
                count++;
                b = scanner.nextInt();
                switch (amal) {

                    case "+":
                        c = arfimetik.add(c, b);
                        count++;
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        break;
                    case "-":
                        c = arfimetik.sub(c, b);
                        count++;
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        break;
                    case "*":
                        c = arfimetik.mul(c, b);
                        count++;
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        break;
                    case "/":
                        c = arfimetik.div(c, b);
                        count++;
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        break;
                    default:
                        System.out.println("Amalni boshqatdan kiriting xatolik bor");
                        System.out.println("Tugatish uchun null kiriting amalga ");
                        break;
                }
            }

            if (amal != "+" || amal != "-" | amal != "*" | amal != "/") switch (amal) {
                case "cosx":
                    c = arfimetik.cos(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "sinx":
                    c = arfimetik.sin(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "pow2":
                    c = arfimetik.pow2(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "pow3":
                    c = arfimetik.pow3(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "sqrt":
                    c = arfimetik.sqrt2(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "sqrt3":
                    c = arfimetik.sqrt3(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "%":
                    c = arfimetik.percentage(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "C":
                    c = arfimetik.c();
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "clear":
                    c = arfimetik.clear();
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "1/X":
                    c = arfimetik.reverse(c);
                    count++;
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
                case "null":
                    t = false;
                    break;
                default:
                    System.out.println("Amalni boshqatdan kiriting xatolik bor");
                    System.out.println("Tugatish uchun null kiriting amalga ");
                    break;
            }

            if (amal.equals("null") || amal.equals("clear")) continue;
            else {
                System.out.println("  pow2  |  pow3   |  + \n  sqrt2 |  sqrt3  |  - \n  sinx  |  cosx   |  * \n  %     |  1/X    |  / \n  C     |  clear  |  null ");
                System.out.print("Amalni kiriting = ");
                amal = scanner.next();
            }
        }
        System.out.println("Bajarilgan amallarni natijasi = " + c);
    }
}