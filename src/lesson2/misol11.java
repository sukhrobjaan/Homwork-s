package lesson2;

public class misol11 {
    public static void main(String[] args) {

        int a=12;
        int b=14;
        int c=~a+~b;
        boolean v1=true;
        boolean v2=false;
        boolean v3=v1|v2&&c<a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(v3);
    }
}
