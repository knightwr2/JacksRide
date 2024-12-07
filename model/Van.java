package model;

public class Van extends Vehicle 
{
    public Van(String vehicleId) 
    {
        super(vehicleId, "Van");
    }

    @Override
    public double calculateFare(double distance) 
    {
        return distance * 3.0; 
    }
}
