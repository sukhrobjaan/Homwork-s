package lesson16.example1;

public class A {

    public static void main(String[] args) {

        Asr.Yillar yillar = new Asr.Yillar();
        Asr.Yillar.FasilQish fasilQish = yillar.new FasilQish();
        System.out.println("QISH fasli");
        System.out.println(fasilQish.decName);
        System.out.println(fasilQish.yanName);
        System.out.println(fasilQish.fevName+"\n");

        Asr.Yillar.FasilBahor fasilBahor=yillar.new FasilBahor();
        System.out.println("BAHOR fasli ");
        System.out.println(fasilBahor.matName);
        System.out.println(fasilBahor.aprName);
        System.out.println(fasilBahor.mayName+"\n");

        Asr.Yillar.FasilYoz a= new Asr.Yillar.FasilYoz();

        
    }
}
