package code;

import code.objects.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static code.objects.Location.calculateDistance;

/**
 * Class that provides methods for analyzing data and communicating with different cars from the network.
 */

public class CommunicationHandler {
    /**
     * The maximum distance a car can be found from the current car. Value representing the Earth's circumference.
     */
    private static final Double MAX_DISTANCE = 40075.017;

    private Car myCar;
    private Map<String, Car> connectedCars;
    private CarCommunication carCommunication;

    /**
     * Constructor using a Car object as parameter.
     *
     * @param myCar A Car object that defines the current car
     */
    public CommunicationHandler(Car myCar) {
        this.myCar = myCar;
        this.connectedCars = getConnectedCars();
    }

    /**
     * Provides all the cars available and connected to the network.
     *
     * @return A HashMap of cars found
     */
    private Map<String, Car> getConnectedCars() {
        Map<String, Car> connectedCars = new HashMap<>();

        //TODO: get connected car list from external database

        return connectedCars;
    }

    /**
     * Calculates the distance between the current car and a specified car from the network.
     *
     * @param carUniqueID ID of the car to which the distance is calculated
     * @return The distance resulted
     */
    public Double calculateDistanceToAnotherCar(String carUniqueID){
        return calculateDistance(myCar.getCurrentLocation(), connectedCars.get(carUniqueID).getCurrentLocation());
    }

    /**
     * Searches for the closest car nearby.
     *
     * @return A Car object of the car found
     */
    public Car getClosestCar(){
        AtomicReference<String> closestCarID = new AtomicReference<>();
        AtomicReference<Double> closestCarDistance = new AtomicReference<>(MAX_DISTANCE);
        connectedCars.forEach( (connectedCarID, connectedCar) -> {
            Double distanceToCar = calculateDistanceToAnotherCar(connectedCarID);
            if(distanceToCar < closestCarDistance.get()){
                closestCarID.set(connectedCarID);
                closestCarDistance.set(distanceToCar);
            }
        });

        return connectedCars.get(closestCarID.get());
    }

    /**
     * Send information about the current car.
     *
     * @param anotherCarID The ID of the receiving car
     */
    public void sentPackageInfoToAnotherCar(String anotherCarID){
        carCommunication.sendCarInfo(anotherCarID, myCar);
    }

    /**
     * Receives information from another car.
     *
     * @return A car object of the sending car
     */
    public Car receivePackageInfoFromAnotherCar(){
        return carCommunication.receiveCarInfo();
    }
}
