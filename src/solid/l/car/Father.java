package solid.l.car;

public class Father implements LightCar,SlowCar{
    @Override
    public String carLight() {
        return "Yingil moshina hayday oladi, ";
    }

    @Override
    public String slow() {
        return "Matasekil hayday oladi, ";
    }
}
