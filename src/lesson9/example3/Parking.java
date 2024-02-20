package lesson9.example3;

public class Parking {
    int maxCount;
    Car[] cars = new Car[1000];
    int count = 0;

    public Parking(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    void addCar(Car car) {
        if (getMaxCount() > 0) {
            cars[count++] = car;
            setMaxCount(getMaxCount() - 1);
        } else System.out.println("Error not maxCount");
    }

    void addCar(Car[] car) {
        if (getMaxCount() >= car.length) {
            for (int i = 0; i < car.length; i++) {
                cars[count++] = car[i];
            }
            setMaxCount(getMaxCount() - car.length);
        } else System.out.println("Error not maxCount");
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return getMaxCount() == 0;
    }

    void showInfo() {
        for (int i = 0; i < count; i++) {
            System.out.println("Car queue -> "+ (i+1));
            System.out.println("Car Name "+cars[i].getCarName());
            System.out.println("Car Number "+cars[i].getCarNumber());
            System.out.println("------------------------------------");
        }
    }
}
