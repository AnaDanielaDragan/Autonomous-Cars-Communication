package code.objects;

import java.util.ArrayList;
import java.util.List;

import static code.objects.Location.calculateDistance;

/**
 * Provides a list of events that the car recorded.
 */
public class Events {
    private List<Event> eventList;

    /**
     * Getter for the list of events.
     *
     * @return List of Event type objects
     */
    public List<Event> getEventList() {
        return eventList;
    }

    /**
     * Adds a new event to the list.
     *
     * @param event Event to be added
     */
    public void addEvent(Event event){
        eventList.add(event);
    }

    /**
     * Deletes an event form the list.
     *
     * @param event Event to be deleted
     */
    public void deleteEvent(Event event){
        eventList.remove(event);
    }

    /**
     * Provides a list of events that took place at a given distance away from the current location of the car.
     *
     * @param maxKmAway Distance to selected events
     * @param currentLocation Current location of the car
     * @return A filtered list of events
     */
    public List<Event> getRecentEvents(Integer maxKmAway, Location currentLocation){
        List<Event> recentEventList = new ArrayList<>();

        eventList.forEach(event -> {
            Double distanceToEvent = calculateDistance(event.getLocation(), currentLocation);
            if(distanceToEvent <= maxKmAway){
                recentEventList.add(event);
            }
        });

        return recentEventList;
    }
}
