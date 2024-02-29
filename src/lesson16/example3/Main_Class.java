package lesson16.example3;

public class Main_Class {
    public static void main(String[] args) {

        Car car=new Car("Malubu",75,10);
        System.out.println("is Active -> "+car.isActive());
        System.out.println("Car refeul -> "+car.refeul(10));
        System.out.println("Car refeul -> "+car.refeul(10));
//        System.out.println("Car refeul -> "+car.refeul(10));
//        System.out.println("Car refeul -> "+car.refeul(10));
//        System.out.println("Car refeul -> "+car.refeul(10));
//        System.out.println("Car refeul -> "+car.refeul(10));
//        System.out.println("Car refeul -> "+car.refeul(10));
        System.out.println("Car max yuradi -> "+car.getMaxWay(10));





        Car car1=new Car("nexia",45,2);
        System.out.println(car1.isActive());
        System.out.println(car1.refeul(12));
        System.out.println(car1.getMaxWay(7));

        Car car2=new Car("tico",36,2);
        System.out.println(car1.isActive());
        System.out.println(car1.refeul(12));
        System.out.println(car1.getMaxWay(4));
    }
}
