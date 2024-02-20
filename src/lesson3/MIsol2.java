package lesson3;

import java.util.Scanner;

public class MIsol2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int ikkilik=scanner.nextInt();
        int unlik=0;
        int count=0;
        while (ikkilik>0){
            int qoldiq=ikkilik%10;
            unlik+=qoldiq*Math.pow(2,count);
            count++;
            ikkilik/=10;
        }
        System.out.println("unlikda ko'rinshi => "+unlik);
    }
}
