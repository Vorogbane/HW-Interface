package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public abstract String startMotion ();
    public abstract String ceaseMotion ();

    public Transport (String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return  brand + " " + model;
    }
}
