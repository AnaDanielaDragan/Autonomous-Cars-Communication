package code.objects;

import java.util.List;

public class Car {
    private CarInfo carInfo;
    private Integer currentSpeed;
    private Location currentLocation;
    private Events events;

    /**
     * Constructor with two parameters.
     *
     * @param carInfo An object of CarInfo type
     * @param initialLocation Initial location of the car
     */
    public Car(CarInfo carInfo, Location initialLocation) {
        this.carInfo = carInfo;
        this.currentLocation = initialLocation;
        this.currentSpeed = 0;
        this.events = new Events();
    }

    /**
     * Getter for car info.
     *
     * @return A CarInfo object
     */
    public CarInfo getCarInfo() {
        return carInfo;
    }

    /**
     * Getter for the current speed of the car.
     *
     * @return Value of current speed
     */
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    /**
     * Setter of current speed of the car.
     *
     * @param currentSpeed Current speed
     */
    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    /**
     * Getter of current location of the car.
     *
     * @return Value of current location
     */
    public Location getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Setter of current location.
     *
     * @param currentLocation Current location
     */
    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Getter for the event list recorded by the car.
     *
     * @return An Events object
     */
    public Events getEvents() {
        return events;
    }

    /**
     * Adds a new event to the event list of the car.
     *
     * @param event An Event object
     */
    public void addEvent(Event event) {
        events.addEvent(event);
    }

    /**
     * Provides a list of events that took place in the last 100 km.
     *
     * @return A filtered list of events
     */
    public List<Event> getEventsInTheLast100Km(){
        return events.getRecentEvents(100, currentLocation);
    }
}
