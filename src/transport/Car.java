package transport;

import java.security.PrivateKey;

public class Car extends Transport implements Contesting {
    public enum BodyType {SEDAN, HATCHBACK, COUPE, STATION_WAGON, SUV, CROSSOVER, PICKUP, VAN, MINIVAN;
        public static String determineBodyType (Car car) {
            Car.BodyType a = null;
            if (car.getBodyType() != null) {
                switch (car.getBodyType()) {
                    case SEDAN: a = SEDAN;
                    break;
                    case HATCHBACK: a = HATCHBACK;
                    break;
                    case COUPE: a = COUPE;
                        break;
                    case STATION_WAGON: a = STATION_WAGON;
                        break;
                    case SUV: a = SUV;
                        break;
                    case CROSSOVER: a = CROSSOVER;
                        break;
                    case PICKUP: a = PICKUP;
                        break;
                    case VAN: a = VAN;
                        break;
                    case MINIVAN: a = MINIVAN;
                        break;
                }
                return a.toString();
            }
            return "Данных недостаточно";
        }
    };
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

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
