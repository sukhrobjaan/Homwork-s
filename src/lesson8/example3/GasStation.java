package lesson8.example3;

public class GasStation {

    int gasSize;
    int startSize = 0;
    Car cars[] = new Car[100];

    public GasStation(int gasSize) {
        this.gasSize = gasSize;
        startSize=gasSize;
    }

    public int getGasSize() {
        return gasSize;

    }

    public void setGasSize(int gasSize) {
        this.gasSize = gasSize;
    }

    boolean isEmpty() {
        return gasSize == 0;
    }

    boolean toSell(Car car) {
        int a=getGasSize();
        setGasSize(getGasSize() - car.capacitys.capacity);
        return car.capacitys.capacity <= a;
    }

    void addPetrol(int addValue) {
        setGasSize(getGasSize() + addValue);
    }


    boolean isSell(Car[] cars) {
        int a=0;
        for (int i = 0; i < cars.length; i++) {
            a+=cars[i].capacitys.capacity;
        }
        if(getGasSize()>=a)return true;
        return false;
    }

}
