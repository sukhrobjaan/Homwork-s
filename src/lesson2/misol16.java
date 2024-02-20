package lesson2;

import java.util.Scanner;

public class misol16 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        int e= scanner.nextInt();
        int count=0;
        if(a>0)count++;
        if(b>0)count++;
        if(c>0)count++;
        if(d>0)count++;
        if(e>0)count++;
        System.out.println("musbatlar  => "+count);
        System.out.println("manfiylar  => "+(5-count));
        System.out.println("manfiylar  => "+(5-count));

        /*String num="salom dunyo qalisan";
        int son=num.length();
        num=num.replace("a","");
        num=num.replace("o","");
        num=num.replace("u","");
        num=num.replace("i","");
        num=num.replace("e","");
        System.out.println("undoshlar soni  => "+num.length());
        System.out.println("unlilar soni  => "+(son-num.length()));*/












//
//            }
//        }


    }
}
