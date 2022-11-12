package transport;

public class Truck extends Transport implements Contesting{

    public enum LoadCapacity {
        N1(0.1,3.5),
        N2(3.6,12.0),
        N3(12.1,1000000000);

        private double minCapacity;
        private double maxCapacity;

        public static String determineCapacity (Truck truck) {
            LoadCapacity a = null;
            if (truck.getLoadCapacity() != null) {
            switch (truck.getLoadCapacity()) {
                case N1: a = N1;
                break;
                case N2: a = N2;
                break;
                case N3: a = N3;
                break;
            }
            return a.toString();
            }
            return "Данных недостаточно";
        }

        public double getMinCapacity() {
            return minCapacity;
        }

        public double getMaxCapacity() {
            return maxCapacity;
        }

        LoadCapacity(double minCapacity, double maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }
    };
    private LoadCapacity loadCapacity;

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

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
