package lesson2;



import java.util.Scanner;

public class misol3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        java.lang.String num=scanner.next();
        int len=num.length();

        num=num.toLowerCase();

        num=num.replace("a","");
        num=num.replace("o","");
        num=num.replace("u","");
        num=num.replace("i","");
        num=num.replace("e","");
        System.out.println("unlilar soni  => "+(len-num.length()));

    }
}
