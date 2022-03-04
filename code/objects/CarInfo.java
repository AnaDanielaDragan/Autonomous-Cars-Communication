package code.objects;

public class CarInfo {
    private String manufacturer;
    private String model;
    private String uniqueID;

    public CarInfo(String manufacturer, String model, String uniqueID) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.uniqueID = uniqueID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getUniqueID() {
        return uniqueID;
    }
}
