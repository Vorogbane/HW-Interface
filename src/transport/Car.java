package transport;

public class Car extends Transport implements Contesting {

    @Override
    public String startMotion() {
        return "Движение начато";
    }

    @Override
    public String ceaseMotion() {
        return "Движение остановлено";
    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String pitStop() {
        return null;
    }

    @Override
    public double bestLapTime() {
        return 0;
    }

    @Override
    public double bestSpeed() {
        return 0;
    }
}
