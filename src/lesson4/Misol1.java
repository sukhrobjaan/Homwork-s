package lesson4;

import java.util.Scanner;

public class Misol1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // 1dan n gacha bo'lgan sonlar yigindisi
        System.out.println("takrorlanivchilar soni");
        int n=scanner.nextInt();
        System.out.println("sakragich ");
        int m=scanner.nextInt();
        System.out.println("tugatish");
        int q=scanner.nextInt();

        int s1=0;
        for (int i = 0; i <= n; i++) {
            if(i==m)continue;
            if(i==q)break;
            s1+=i;
        }
        System.out.println("s1="+s1);

        s1=0;
        int j=0;
        while (j<=n){
            if(j==m){
                j++;
                continue;
            }
            s1=j;
            j++;
        }
        System.out.println("s2="+s1);

        s1=0;
        j=0;
        do{
            if(j==m){
                j++;
                continue;
            }
            s1+=j;
            j++;
        }while (j<=n);
        System.out.println("s3="+s1);

    }
}
