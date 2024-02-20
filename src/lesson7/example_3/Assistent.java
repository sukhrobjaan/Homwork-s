package lesson7.example_3;

public class Assistent {
    int addTwoNumber(int a,int b){
        return a+b;
    }
    int pow(int a,int b){

        int daraja=1;
        for (int i = 0; i < b; i++) {
            daraja*=a;
        }
        return daraja;
    }
    int abs(int a){
        if(a<0)return a*(-1);
        return a;
    }
    int getWholeSection(double a){
        if(a<0)return (int) (a-1);
        return (int) a;
    }
}
