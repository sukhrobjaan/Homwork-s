package lesson16.example3;

public class Car {
    private String carName;
    private int maxCapacity;
    private int busyCapacity;

    private static Car instance = null;

    public Car(String carName, int maxCapacity, int busyCapacity) {
        this.carName = carName;
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }


    public String getCarName() {
        return carName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBusyCapacity() {
        return busyCapacity;
    }

    public void setBusyCapacity(int busyCapacity) {
        this.busyCapacity = busyCapacity;
    }

    public static Car getInstance(String carName, int maxCapacity, int busyCapacity) {
        if (instance == null) {
            instance = new Car(carName, maxCapacity, busyCapacity);
        }
        return instance;
    }

    boolean isActive() {
        if (getBusyCapacity() > 0) {
            return true;
        }
        return false;
    }

    boolean refeul(int addPetrol) {
        if (getMaxCapacity() - getBusyCapacity() >= addPetrol) {
            setBusyCapacity(getBusyCapacity() + addPetrol);
            return true;
        }
        return false;
    }
    int getMaxWay(int value){
        return getBusyCapacity()*value;
    }



}
