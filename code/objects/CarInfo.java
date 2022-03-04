package code.objects;

public class CarInfo {
    private String manufacturer;
    private String model;
    private String uniqueID;

    /**
     * Constructor with three parameters.
     *
     * @param manufacturer A car's manufacturer name
     * @param model A car's model name
     * @param uniqueID The car's unique ID
     */
    public CarInfo(String manufacturer, String model, String uniqueID) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.uniqueID = uniqueID;
    }

    /**
     * Getter for the manufacturer variable.
     *
     * @return Manufacturer name
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Getter fo the model variable.
     *
     * @return Model name
     */
    public String getModel() {
        return model;
    }

    /**
     * Getter for the car's unique ID.
     *
     * @return Car ID
     */
    public String getUniqueID() {
        return uniqueID;
    }
}
