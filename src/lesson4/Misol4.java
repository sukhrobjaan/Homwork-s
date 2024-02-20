package lesson4;

import java.util.Scanner;

public class Misol4 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0)
                count++;
        }
        System.out.println("juftlar soni => "+count);
    }
}
