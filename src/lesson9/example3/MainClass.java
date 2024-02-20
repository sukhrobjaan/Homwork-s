package lesson9.example3;

public class MainClass {
    public static void main(String[] args) {

        Parking parking = new Parking(100);
        System.out.println("in isEmpty " + parking.isEmpty());

        parking.addCar(new Car("Matiz", "01 | A 025 CA"));
        parking.addCar(new Car("Malubu", "01 | A 026 AA"));
        parking.addCar(new Car("Cobolt", "01 | A 027 QA"));
        parking.addCar(new Car("Teco", "01 | A 028 WA"));
        parking.addCar(new Car("Gentra", "01 | A 029 EA"));
        parking.addCar(new Car("KiA", "01 | A 030 RA"));
        parking.addCar(new Car("Monza", "01 | A 031 TA"));
        parking.addCar(new Car("Nexio 2", "01 | A 032 JA"));
        parking.addCar(new Car("onix", "01 | A 033 MA"));


        parking.addCar(new Car[]{new Car("onix", "01 | A 008 MA"), new Car("Nexio 2", "01 | A 009 JA"), new Car("Monza", "01 | A 007 TA"), new Car("KiA", "01 | A 006 RA"), new Car("Gentra 1.5", "01 | A 005 EA"), new Car("Teco", "01 | A 002 WA"), new Car("Cobolt", "01 | A 003 QA"), new Car("Malubu", "01 | A 004 AA"), new Car("Matiz", "01 | A 001 CA")});

        System.out.println("in isEmpty " + parking.isEmpty());
        System.out.println("in isFull " + parking.isFull());
        System.out.println("--------------");
        parking.showInfo();


    }
}
