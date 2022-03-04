package code.objects;

import java.util.ArrayList;
import java.util.List;

import static code.objects.Location.calculateDistance;

public class Events {
    private List<Event> eventList;

    public List<Event> getEventList() {
        return eventList;
    }

    public void addEvent(Event event){
        eventList.add(event);
    }

    public void deleteEvent(Event event){
        eventList.remove(event);
    }

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
