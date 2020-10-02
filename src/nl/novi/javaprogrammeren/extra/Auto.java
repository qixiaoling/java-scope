package nl.novi.javaprogrammeren.extra;

public class Auto {
    private String buildYear;
    private String brand;
    private String category;
    private String licensePlate;
    private int kiloMeters;
    private double askPrice;
    private double sellPrice;

    public Auto(String buildYear, String brand, String category, String licensePlate, int kiloMeters, double askPrice, double sellPrice) {
        this.buildYear = buildYear;
        this.brand = brand;
        this.category = category;
        this.licensePlate = licensePlate;
        this.kiloMeters = kiloMeters;
        this.askPrice = askPrice;
        this.sellPrice = sellPrice;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getKiloMeters() {
        return kiloMeters;
    }

    public void setKiloMeters(int kiloMeters) {
        this.kiloMeters = kiloMeters;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.sellPrice = sellPrice;
    }
    public double askPriceVatInclusive(double taxRate){
        double result = getAskPrice()*(1+taxRate);
        return result;
    }
    public double sellPriceVatInclusive(double taxRate){
        double result=getSellPrice()*(1+taxRate);
        return result;
    }
}
