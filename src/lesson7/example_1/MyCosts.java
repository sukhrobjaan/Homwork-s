package lesson7.example_1;

public class MyCosts {
    String userName;
    int money;

    public MyCosts(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public void showInfo() {
        System.out.println(userName);
        System.out.println(money);

    }


    public int getNowMoney() {
        return money;
    }

    public void spendMovey(int spned) {
        this.money = spned;
        showInfo();
    }

    public void addMoney(int addSumm) {
        this.money = addSumm;
        showInfo();
    }
}
