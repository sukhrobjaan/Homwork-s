package lesson7.example_4;

public class MakeIceCream {
    int milk;
    int sugar;

    public MakeIceCream(int milk, int sugar) {
        this.milk = milk;
        this.sugar = sugar;
    }

    void addMilk(int a){
        milk+=a;
    }
    void addSugar(int b){
        sugar+=b;
    }

    int maxIceCreamCount(int a,int b){
        int a1=milk/a;
        int b1=sugar/b;
        if(a1<b1)return a1;
        return b1;
    }

    void showInfo(){
        System.out.println("hozida milk ="+milk);
        System.out.println("hozida sugar ="+sugar);
    }
    void makeIceCream(int a, int b,int count){
        if(a*count<=milk&&b*count<=sugar){
            System.out.println("milk qolgani="+(milk - a * count));
            System.out.println("sugar qolgani="+(sugar - b * count));
        }
        else{
            System.out.println("count ta musqaymoq tayyorlab bo'lmaydi");
        }
    }

}
