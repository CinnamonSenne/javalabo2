public class Car {
    private int trackingnr;
    private Brand brand;
    private Type type;
    private int amountKm;
    private int chassisNr;
    private int licenseNr;

    public void setAmountKm(int amountKm) {
        this.amountKm = amountKm;
    }

    public void setLicenseNr(int licenseNr) {
        this.licenseNr = licenseNr;
    }

    public Car(int trackingnr, Brand brand, Type type, int amountKm, int chassisNr, int licenseNr) {
        this.trackingnr = trackingnr;
        this.brand = brand;
        this.type = type;
        this.amountKm = amountKm;
        this.chassisNr = chassisNr;
        this.licenseNr = licenseNr;
    }


}
