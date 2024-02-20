package lesson8.example5;

public abstract class Car {
    private double maxCapacity;
    private double busyCapacity;

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getBusyCapacity() {
        return busyCapacity;
    }

    public Car(double maxCapacity, double busyCapacity) {
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }

    abstract double maxLongestWay();

    abstract double getMaxOilFromRefill();



}
