package lesson2;

public class misol7 {
    public static void main(String[] args) {

        int a = 12;
        int b = 14;
        int c = a + b;
        a += b & c;
        b *= c++;
        b /= 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
