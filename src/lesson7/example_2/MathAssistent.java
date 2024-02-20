package lesson7.example_2;

public class MathAssistent {

    int number;

    public MathAssistent(int number) {
        this.number = number;
    }
    int pow(int degree){
        int daraja=1;
        int i=0;
        while (i<degree){
            daraja*=number;
            i++;
        }
        return daraja;
    }
    int summDigitNumber(){
        int summ=0;
        while (number>0){
            int a=number%10;
            summ+=a;
            number/=10;
        }
        return summ;
    }
}
