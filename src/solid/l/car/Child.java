package solid.l.car;

public class Child implements SlowCar,LoadCar,LightCar{
    @Override
    public String carLight() {
        return "Yingil mashina hayday oladi, ";
    }

    @Override
    public String carLoad() {
        return "Yuk mashina hayday oladi, ";
    }

    @Override
    public String slow() {
        return "Matasekil hayday oladi, ";
    }
}
