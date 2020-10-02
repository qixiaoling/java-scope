package nl.novi.javaprogrammeren.extra;
import java.util.ArrayList;
import java.util.List;

public class Verkoper {
    private String compnayName;
    private String telefonenr;
    private String webpage;
    private String taxNumber;
    private List<Auto> cars;

    public Verkoper(String compnayName, String telefonenr, String webpage, String taxNumber, List<Auto> cars){
        this.compnayName=compnayName;
        this.telefonenr=telefonenr;
        this.webpage=webpage;
        this.taxNumber=taxNumber;
        if(cars.size()>1 && cars.size()<10){
            this.cars=new ArrayList<>();
        }else{
            throw new RuntimeException("There should be 2-10 cars in the list.");

        }

    }

    public String getCompnayName() {
        return compnayName;
    }

    public void setCompnayName(String compnayName) {
        this.compnayName = compnayName;
    }

    public String getTelefonenr() {
        return telefonenr;
    }

    public void setTelefonenr(String telefonenr) {
        this.telefonenr = telefonenr;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public List<Auto> getCars() {
        return cars;
    }

    public void setCars(List<Auto> cars) {
        this.cars = cars;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb=sb.append(getCompnayName())
                .append("has sold")
                .append(this.cars.size())
                .append("cars.");
        for (Auto car:cars){
            sb.append("\n\r").append(car.getLicensePlate());
        }
        return sb.toString();
    }
}
