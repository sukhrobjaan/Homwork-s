package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Misol14 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        int n=scanner.nextInt();
        int []arrDeleteIndex=new int[n];
        for (int i = 0; i < n; i++) {
            arrDeleteIndex[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arrDeleteIndex[i]==arrDeleteIndex[j]) arrDeleteIndex[j]=0;
            }
        }
        int[] arr = Arrays.stream(arrDeleteIndex).filter(value -> value!=0).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
