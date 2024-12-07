package model;

public class Bike extends Vehicle
 {
    public Bike(String vehicleId) 
    {
        super(vehicleId, "Bike");
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * 1.0; 
    }
}