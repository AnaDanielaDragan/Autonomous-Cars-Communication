package code.objects;

import code.objects.Location;

/**
 * Class that holds the information about an event encountered by a car.
 */
public class Event {
    private String type;
    private Location location;

    /**
     * Constructor with two parameters.
     *
     * @param type Type of event
     * @param location Location when recorded
     */
    public Event(String type, Location location) {
        this.type = type;
        this.location = location;
    }

    /**
     * Getter for the event type.
     *
     * @return The type of event
     */
    public String getType() {
        return type;
    }

    /**
     * Getter for the event location.
     *
     * @return The event location
     */
    public Location getLocation() {
        return location;
    }
}
