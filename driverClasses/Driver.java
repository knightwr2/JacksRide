package driverClasses;

public class Driver extends User {
    private Vehicle vehicle;
    private boolean isAvailable;

    public Driver(String username, String name, Vehicle vehicle) {
        super(username, name);
        this.vehicle = vehicle;
      
      // Assume the driver is available 
      this.isAvailable = true; 
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double calculateFare(double distance) {
        return vehicle.calculateFare(distance); 
    }

    public void acceptRide(RideRequest request) {
        if (isAvailable) {
            System.out.println("Driver " + getName() + " has accepted the ride request.");
            setAvailability(false); 
        } else {
            System.out.println("Driver " + getName() + " is not available.");
        }
    }

    public void completeRide() {
        System.out.println("Ride completed. Driver " + getName() + " is now available.");
        setAvailability(true); 
}

