package model;

public class Car extends Vehicle 
{
    public Car(String vehicleId)
     {
        super(vehicleId, "Car");
    }

    @Override
    public double calculateFare(double distance)
     {
        return distance * 2.0; 
    }
}
