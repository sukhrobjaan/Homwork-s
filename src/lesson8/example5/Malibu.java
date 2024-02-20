package lesson8.example5;

public class Malibu extends Car{


    public Malibu(double maxCapacity, double busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    double maxLongestWay() {
        return getBusyCapacity()*100/11;
    }

    @Override
    double getMaxOilFromRefill() {
        return getMaxCapacity()-getBusyCapacity();
    }
}
