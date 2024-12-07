package model;

public abstract class Vehicle 
{
    private String vehicleId;
    private String type;

    public Vehicle(String vehicleId, String type) 
    {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleId() {
        return vehicleId;
    }

    public String getType() 
    {
        return type;
    }
}