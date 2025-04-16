import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
        System.out.println("Current Location: " + location);
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }

    abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm(); // Flat rate
    }
}

class Bike extends Vehicle {
    Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% discount
    }
}

class Auto extends Vehicle {
    Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() + 10; // Base fare ₹10
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();

        Vehicle car = new Car("C123", "Arun", 15.0);
        Vehicle bike = new Bike("B456", "Sneha", 8.0);
        Vehicle auto = new Auto("A789", "Ravi", 10.0);

        car.updateLocation("Chennai");
        bike.updateLocation("Bangalore");
        auto.updateLocation("Hyderabad");

        rides.add(car);
        rides.add(bike);
        rides.add(auto);

        double distance = 12.5; 

        System.out.println("Ride Fare Summary");
        for (Vehicle ride : rides) {
            ride.getVehicleDetails();
            double fare = ride.calculateFare(distance);
            System.out.println("Trip Distance: " + distance + " km");
            System.out.println("Total Fare: ₹" + fare);
            System.out.println("---------------------------");
        }
    }
}
