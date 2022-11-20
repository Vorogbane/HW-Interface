package transport;

public abstract class Transport {
    private Driver driver;
    private String brand;
    private String model;
    private double engineVolume;
    private boolean isDiagnosed;
    public abstract String startMotion ();
    public abstract String ceaseMotion ();

    public String checkIfDiagnosed () {
        if (this.getDriver() == null) {
            throw new RuntimeException("Нет водителя");
        }
        if (this.getDriver().getLicense() == null || !this.getDriver().getLicense().matches("[A-Za-z0-9]{1,2}")) {
            throw new RuntimeException("Необходимо указать тип прав!");
        }
        if (this.isDiagnosed == false) {
            throw new RuntimeException("Надо пройти диагностику");
        }
        return "Все нормально";
    }
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean isDiagnosed() {
        return isDiagnosed;
    }

    public void setDiagnosed(boolean diagnosed) {
        isDiagnosed = diagnosed;
    }

    @Override
    public String toString() {
        return  brand + " " + model;
    }
}
