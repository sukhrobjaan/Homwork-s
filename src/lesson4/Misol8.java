package lesson4;

import java.util.Scanner;

public class Misol8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arrElementSort=new int[n];

        for (int i = 0; i < n; i++) {
            arrElementSort[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arrElementSort[i]<arrElementSort[j]){
                    int temp=arrElementSort[i];
                    arrElementSort[i]=arrElementSort[j];
                    arrElementSort[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrElementSort[i]+" ");
        }
    }
}
