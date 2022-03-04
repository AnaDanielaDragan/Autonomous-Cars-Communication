package code;

import code.objects.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static code.objects.Location.calculateDistance;

public class CommunicationHandler {
    private static final Double MAX_DISTANCE = 40075.017;
    private Car myCar;
    private Map<String, Car> connectedCars;
    private CarCommunication carCommunication;

    public CommunicationHandler(Car myCar) {
        this.myCar = myCar;
        this.connectedCars = getConnectedCars();
    }

    private Map<String, Car> getConnectedCars() {
        Map<String, Car> connectedCars = new HashMap<>();

        //TODO: get connected car list from external database

        return connectedCars;
    }

    public Double calculateDistanceToAnotherCar(String carUniqueID){
        return calculateDistance(myCar.getCurrentLocation(), connectedCars.get(carUniqueID).getCurrentLocation());
    }

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

    public void sentPackageInfoToAnotherCar(String anotherCarID){
        carCommunication.sendCarInfo(anotherCarID, myCar);
    }

    public Car receivePackageInfoFromAnotherCar(){
        return carCommunication.receiveCarInfo();
    }
}
