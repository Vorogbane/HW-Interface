package transport;

public class Bus extends Transport implements Contesting {

    public enum Capacity {
        VERY_SMALL("1-10"),
        SMALL("11-25"),
        AVERAGE("26-60"),
        BIG("61-80"),
        VERY_BIG("81-120");


        public static String determineCapacity (Bus bus) {
            Bus.Capacity a = null;
            if (bus.getCapacity() != null) {
                switch (bus.getCapacity()) {
                    case VERY_SMALL: a = VERY_SMALL;
                    break;
                    case SMALL: a = SMALL;
                    break;
                    case AVERAGE: a = AVERAGE;
                    break;
                    case BIG: a = BIG;
                    break;
                    case VERY_BIG: a= VERY_BIG;
                    break;
                }
                return a.toString();
            }
            return "Данных недостаточно";
        }

        private final String capacity;


        Capacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    };

    Capacity capacity;

    public String checkIfDiagnosed () {
        if (this.getDriver().getLicense() == null || !this.getDriver().getLicense().matches("[A-Za-z0-9]{1,2}")) {
            throw new RuntimeException("Необходимо указать тип прав!");
        }
        return "Автобусам не над проходить диагностику";
    }



    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

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
