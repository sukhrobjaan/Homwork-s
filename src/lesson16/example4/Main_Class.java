package lesson16.example4;

public class Main_Class {
    public static void main(String[] args) {
        Student student=new Student("Aliyev","Vali",21,3){
            @Override
            void showInfo() {
                System.out.println("Fruit Name -> " + "Valiyev");
                System.out.println("Fruit Color -> " + "Alijon");
                System.out.println("Fruit Weight -> " + 19);
                System.out.println("Fruit Weight -> " + 3);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        };
        student.showInfo();

        Student student1=new Student("Aliyev","Vali",21,3){
            @Override
            void showInfo() {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Fruit Name -> " + "Shommat");
                System.out.println("Fruit Color -> " + "Alijon");
                System.out.println("Fruit Weight -> " + 19);
                System.out.println("Fruit Weight -> " + 3);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }
        };
        student.showInfo();


    }
}