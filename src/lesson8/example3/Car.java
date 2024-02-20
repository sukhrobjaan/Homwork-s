package lesson8.example3;

public class Car {
    Oil oil;
    Capacity capacitys;

    public Oil getOil() {
        return oil;
    }

    public Capacity getCapacity() {
        return capacitys;
    }

    public Car(Oil oil, Capacity capacitys) {
        this.oil = oil;
        this.setCapacity(capacitys);
    }

    public void setCapacity(Capacity capacitys) {
        this.capacitys = capacitys;
    }
}
