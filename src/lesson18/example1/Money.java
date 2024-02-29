package lesson18.example1;

public class Money {
    private int amount;
    private int count;

    public Money(int amount, int count) {
        this.amount = amount;
        this.count = count;
    }


    void set(Money money) {
        this.amount += money.amount;
        this.count += money.count;
    }

    public int getAmount() {
        return amount;
    }

    public int getCount() {
        return count;
    }
}
