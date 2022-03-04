package code;

import code.objects.Car;

public interface CarCommunication {
    void sendCarInfo(String receivingCarID, Car sendingCar);
    Car receiveCarInfo();
}
