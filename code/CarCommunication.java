package code;

import code.objects.Car;

import java.util.Map;

/**
 * Interface that defines the methods used by the Handler class in order to communicate with another car.
 * Implementations can be done according to the network specifications and technologies used.
 */

public interface CarCommunication {
    /**
     * Defines the process of sending information from a connected car to another.
     *
     * @param receivingCarID Unique id of the receiving car
     * @param sendingCar Car object of the sending car
     */
    void sendCarInfo(String receivingCarID, Car sendingCar);

    /**
     * Defines the process of receiving information from a connected car to another.
     *
     * @return Data from the sending car, in a Car object form
     */
    Car receiveCarInfo();

    /**
     * Defines the process of retrieving all the cars available and connected to the network.
     *
     * @return A HashMap of cars found
     */
     Map<String, Car> getConnectedCars();
}
