package lesson18.example1;

public class Main_Class {
    public static void main(String[] args) {
        Money money=new Money(10000,10);
        ATM atm=new ATM();
        atm.lists.add(money);

    }

}
