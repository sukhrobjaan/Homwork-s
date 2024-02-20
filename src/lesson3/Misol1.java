package lesson3;

import java.util.Scanner;

public class Misol1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int count=0;
        int summ=0;
        for (int i = 100; i < 200; i++) {
            if(i%9==0){
                count++;
                summ+=i;
            }
        }
        System.out.println("100 dan 200 gacha bulgan sonlarni 9ga bo'lganda sonlari => "+count);
        System.out.println("100 dan 200 gacha bulgan sonlarni 9ga bo'linadigan sonlar yigindisi => "+summ);
    }
}
