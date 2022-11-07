package transport;

public class Truck extends Transport implements Contesting{



    @Override
    public String startMotion() {
        return "Движение начато";
    }

    @Override
    public String ceaseMotion() {
        return "Движение остановлено";
    }

    public Truck (String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String pitStop() {
        return "Тут был питостоп";
    }

    @Override
    public double bestLapTime() {
        return 25.2;
    }

    @Override
    public double bestSpeed() {
        return 0;
    }
}
