package transport;

import transport.Transport;

public abstract class Driver <A extends Transport> {

    private String fio;
    private String license;
    private int experience;

    public String moveTransport (A transport) {
        return  transport.startMotion();
    }
    public String claimContesting (A transport) {
        transport.setDriver(this);
        return "Водитель " + this.toString() + " управляет " + transport.toString() + " и готов к соревнованиям";
    }

    public Driver(String fio, String license, int experience) {
        this.fio = fio;
        this.license = license;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return getFio();
    }
}
