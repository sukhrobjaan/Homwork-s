package lesson8.example3;

public class Main_Class {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation(100);


        System.out.println("Empty = " + gasStation.isEmpty());
        System.out.println("Car's  qiymat = " + gasStation.toSell(new Car(new Oil("Ai 92"), new Capacity(23))));
        System.out.println("Car's  qiymat = " + gasStation.toSell(new Car(new Oil("Ai 92"), new Capacity(24))));
        System.out.println("Car's  qiymat = " + gasStation.toSell(new Car(new Oil("Ai 92"), new Capacity(30))));

        gasStation.addPetrol(100);
        System.out.println("Car's list = "+gasStation.isSell(
                new Car[]{new Car(new Oil("Ai 92"), new Capacity(23)),
                new Car(new Oil("Ai 92"), new Capacity(23)),
                new Car(new Oil("Ai 92"), new Capacity(50)),
                new Car(new Oil("Ai 92"), new Capacity(6)),
                new Car(new Oil("Ai 92"), new Capacity(18))}));
    }
}
