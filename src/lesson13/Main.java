package lesson13;


public class Main {
    public static void main(String[] args) {

        Bookshop bookshop = new Bookshop("ShowMessage", 100000);

        System.out.println("Summ = " + bookshop.buyBooks(new Books("salom", 100), 5));
        bookshop.buyBooks(new Books("salom1", 100), 5);
        bookshop.buyBooks(new Books("salom2", 100), 9);
        bookshop.buyBooks(new Books("salom3", 100), 12);
        bookshop.buyBooks(new Books("salom4", 100), 213);
        bookshop.buyBooks(new Books("salom5", 100), 52);
        bookshop.buyBooks(new Books("salom6", 100), 5321);
        bookshop.buyBooks(new Books("salom6", 100), 23);
        System.out.println("2");

        System.out.println(bookshop.hasBook());
        System.out.println("3");

        System.out.println(bookshop.hasBook(new Books("salom5", 200)));
        System.out.println("4");

        System.out.println(bookshop.getMoney());
        System.out.println("5");

        System.out.println(bookshop.sell(new Books("salom2", 99)));
        System.out.println(bookshop.sell(new Books("salom6", 44)));
        System.out.println(bookshop.sell(new Books("salom", 99)));
        System.out.println("6");

        System.out.println(bookshop.getCount());
        System.out.println("7");

        System.out.println(bookshop.getCount(new Books("salom1", 5)));
        System.out.println("8");

        bookshop.getBookShopName();

    }
}