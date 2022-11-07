package transport;

public class Bus extends Transport implements Contesting {

    public Bus (String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public String startMotion() {
        return "Движение начато";
    }

    @Override
    public String ceaseMotion() {
        return "Движение остановлено";
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
