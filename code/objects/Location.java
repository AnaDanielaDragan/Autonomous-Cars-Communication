package code.objects;

import java.awt.geom.Point2D;

/**
 * Class that provides a representation of the location, using two coordinates points.
 */

public class Location {
    private Integer coordinateX;
    private Integer coordinateY;

    /**
     * Constructor with two parameters.
     *
     * @param coordinateX Coordinate on the X axis
     * @param coordinateY Coordinate on the Y axis
     */
    public Location(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    /**
     * Getter of X coordinate.
     *
     * @return Coordinate x
     */
    public Integer getCoordinateX() {
        return coordinateX;
    }

    /**
     * Getter of Y coordinate.
     *
     * @return Coordinate Y
     */
    public Integer getCoordinateY() {
        return coordinateY;
    }

    /**
     * Setter for X coordinate.
     *
     * @param coordinateX value for X coordinate
     */
    public void setCoordinateX(Integer coordinateX) {
        this.coordinateX = coordinateX;
    }

    /**
     * Setter for Y coordinate.
     *
     * @param coordinateY value for Y coordinate
     */
    public void setCoordinateY(Integer coordinateY) {
        this.coordinateY = coordinateY;
    }

    /**
     * Calculates distance between two locations.
     *
     * @param givenLocation Location to which the distance is calculated
     * @param currentLocation Current location
     * @return Value of the calculated distance
     */
    public static Double calculateDistance(Location givenLocation, Location currentLocation) {
        return Point2D.distance(givenLocation.getCoordinateX(), givenLocation.getCoordinateY(), currentLocation.getCoordinateX(), currentLocation.getCoordinateY());
    }
}
