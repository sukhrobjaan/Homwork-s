package lesson16.example1;

public class newAsr {
    public static class Yillar {
        protected class FasilQish {
            String decName = "dekabr";
            String yanName = "yanvar";
            String fevName = "fevral";
        }
        public class FasilBahor  {
            String matName = "mart";
            String aprName = "aprel";
            String mayName = "may";
        }
    }

    public static void main(String[] args) {

        Yillar.FasilQish fasilQish = new Yillar().new FasilQish();
        System.out.println(fasilQish.decName);
        System.out.println(fasilQish.yanName);
        System.out.println(fasilQish.fevName+"\n");

        Yillar.FasilBahor fasilBahor = new Yillar().new FasilBahor();
        System.out.println(fasilBahor.matName);
        System.out.println(fasilBahor.aprName);
        System.out.println(fasilBahor.mayName);


      /**  B b=new B(){
            @Override
            public void souwinfo(String name) {
                System.out.println("Salom dunyo");
            }
        };*/
    }
}

