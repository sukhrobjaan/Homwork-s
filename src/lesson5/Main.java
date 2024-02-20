package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(Arrays.toString(arrAsc(n, m)));*/

       /* Animal animal = new Animal();
        animal.name="alisher";
        animal.feature="yuradi";
        animal.color="sariq";
        animal.sher(animal.name,animal.feature,animal.color);
        animal.name="sasha";
        animal.feature="huradi Wov Wov";
        animal.color="oq qora";
        animal.it(animal.name,animal.feature,animal.color);*/
    }

    private static int[]arrAsc( int n, int m) {
        int s=0;
        for (int i = n; i <m ; i++) {
            s+=i;
        }
        int[]arr=new int[s];
        int count=0;
        for (int i = n; i < m; i++) {
            for (int j = 0; j < i; j++) {
                arr[count++]=i;
            }
        }
        return arr;
    }
}