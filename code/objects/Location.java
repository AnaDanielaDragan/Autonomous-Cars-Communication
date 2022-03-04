package code.objects;

import java.awt.geom.Point2D;

public class Location {
    private Integer coordinateX;
    private Integer coordinateY;

    public Location(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    public static Double calculateDistance(Location eventLocation, Location currentLocation) {
        return Point2D.distance(eventLocation.getCoordinateX(), eventLocation.getCoordinateY(), currentLocation.getCoordinateX(), currentLocation.getCoordinateY());
    }
}
