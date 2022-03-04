package code.objects;

import code.objects.CarInfo;
import code.objects.Event;
import code.objects.Events;
import code.objects.Location;

import java.util.List;

public class Car {
    private CarInfo carInfo;
    private Integer currentSpeed;
    private Location currentLocation;
    private Events events;

    public Car(CarInfo carInfo, Location initialLocation) {
        this.carInfo = carInfo;
        this.currentLocation = initialLocation;
        this.currentSpeed = 0;
        this.events = new Events();
    }

    public CarInfo getCarInfo() {
        return carInfo;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Events getEvents() {
        return events;
    }

    public void addEvent(Event event) {
        events.addEvent(event);
    }

    public List<Event> getEventsInTheLast100Km(){
        return events.getRecentEvents(100, currentLocation);
    }
}
