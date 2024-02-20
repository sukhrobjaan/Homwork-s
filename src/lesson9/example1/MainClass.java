package lesson9.example1;

public class MainClass {
    public static void main(String[] args) {

        Telegram telegram = new Telegram();

        System.out.print(telegram.createAcount(new User("choriyorov", "sukhrob", "+998900081712", 23))+"\t");
        telegram.checkSMSCode(11111, "+998900081712");
        System.out.print(telegram.createAcount(new User("choriyorov2", "sukhrob2", "+998900081713", 23))+"\t");
        telegram.checkSMSCode(11112, "+998900081713");
        System.out.print(telegram.createAcount(new User("choriyorov3", "sukhrob3", "+998900081714", 23))+"\t");
        telegram.checkSMSCode(11113, "+998900081714");
        System.out.print(telegram.createAcount(new User("choriyorov4", "sukhrob4", "+998900081715", 23))+"\t");
        telegram.checkSMSCode(11114, "+998900081715");
        System.out.print(telegram.createAcount(new User("choriyorov5", "sukhrob5", "+998900081716", 23))+"\t");
        telegram.checkSMSCode(11115, "+998900081716");
        System.out.print(telegram.createAcount(new User("choriyorov6", "sukhrob6", "+998900081717", 23))+"\t");
        telegram.checkSMSCode(11116, "+998900081717");

        System.out.println("User's count = "+telegram.getUserAccount());

        telegram.deleteAccount("+998900081713");

        telegram.showInfo();
    }
}
