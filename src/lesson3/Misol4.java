package lesson3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Misol4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String satr = scanner.nextLine();
        String satr2 = "";
        int count=0;
        for (int i = 0; i < satr.length() - 1; i++) {
            if (satr.charAt(i) == ' ' && ' ' == satr.charAt(i + 1)) {
                count++;
            }
        }
        int probel=0;
        for (int i = 0; i < satr.length() ; i++) {
            if (satr.charAt(i) == ' ') {
                probel++;
            }
        }
        System.out.println(" So'zlar soni => "+(probel-count+1));



    }
}
