package lesson13;


public class Bookshop {
    String bookshopName;
    int bookshopCosts;
    int count = 0;
    Books[] book = new Books[1000];

    public Bookshop(String bookshopName, int bookshopCosts) {
        this.bookshopName = bookshopName;
        this.bookshopCosts = bookshopCosts;
    }

    public String getBookshopName() {
        return bookshopName;
    }

    public int getBookshopCosts() {
        return bookshopCosts;
    }

    public void setBookshopName(String bookshopName) {
        this.bookshopName = bookshopName;
    }

    public void setBookshopCosts(int bookshopCosts) {
        this.bookshopCosts = bookshopCosts;
    }

    int buyBooks(Books books, int counts) {
        if (getBookshopCosts() >= counts * books.getBookCost()) {
            book[count++] = books;
            setBookshopCosts(getBookshopCosts() - counts * books.getBookCost());
        }
        return books.bookCost * counts;
    }

    boolean hasBook() {
        return book.length != 0;
    }

    boolean hasBook(Books books) {
        for (Books b : book) {
            if (b.getBookName() == books.getBookName()) return true;
        }
        return false;
    }

    int getMoney() {
        return getBookshopCosts();
    }

    int sell(Books books) {
        for (Books books1 : book) {
            if (books1.getBookName() == books.getBookName() && books1.getBookCost() >= books.getBookCost()) {
                books1.setBookCost(books1.getBookCost() - books.getBookCost());
                return books.getBookCost();
            }
        }
        return 0;
    }

    int getCount(Books books) {

        for (Books books1 : book) {
            if (books1.getBookName() == books.getBookName()) {
                return books1.getBookCost();
            }
        }
        return 0;
    }

    int getCount() {
        int s = 0;
        for (Books books1 : book) {
            // s = s + books1.getBookCost();
        }
        return s;
    }


    void getBookShopName() {
        for (int i = 0; i < count; i++) {
            System.out.println(book[i].getBookName());
            System.out.println(book[i].getBookCost());
            System.out.println("---------------");
        }
    }


}
