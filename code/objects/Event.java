package code.objects;

import code.objects.Location;

public class Event {
    private String type;
    private Location location;

    public Event(String type, Location location) {
        this.type = type;
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }
}
