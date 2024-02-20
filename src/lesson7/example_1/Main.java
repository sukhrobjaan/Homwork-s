package lesson7.example_1;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int money = scanner.nextInt();

        MyCosts myCosts = new MyCosts(name, money);

        myCosts.showInfo();

        System.out.println(myCosts.getNowMoney());
        myCosts.spendMovey(100);
        myCosts.addMoney(200);


    }
}