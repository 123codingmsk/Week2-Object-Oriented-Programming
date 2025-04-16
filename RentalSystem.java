import java.util.*;

interface Insurable {
    void calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    private String insurancePolicyNumber;

    Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    abstract void calculateRentalCost(int days);

    public void displayInfo() {
        System.out.println("\nVehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + " per day");
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    void calculateRentalCost(int days) {
        double total = rentalRate * days;
        System.out.println("Car Rental Cost for " + days + " days: ₹" + total);
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Car Insurance Cost: ₹" + (rentalRate * 0.1));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy (hidden): *****" + getInsurancePolicyNumber().substring(getInsurancePolicyNumber().length() - 4));
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    void calculateRentalCost(int days) {
        double total = rentalRate * days;
        System.out.println("Bike Rental Cost for " + days + " days: ₹" + total);
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Bike Insurance Cost: ₹" + (rentalRate * 0.05));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy (hidden): *****" + getInsurancePolicyNumber().substring(getInsurancePolicyNumber().length() - 4));
    }
}

class Truck extends Vehicle {
    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    void calculateRentalCost(int days) {
        double total = rentalRate * days + 500; 
        System.out.println("Truck Rental Cost for " + days + " days (incl. cargo charge): ₹" + total);
    }

    @Override
    public void calculateInsurance() {
        System.out.println("Truck Insurance Cost: ₹" + (rentalRate * 0.15));
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy (hidden):***" + getInsurancePolicyNumber().substring(getInsurancePolicyNumber().length() - 4));
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 1000, "CARPOLICY4567"));
        vehicles.add(new Bike("BIKE456", 300, "BIKEPOLICY8923"));
        vehicles.add(new Truck("TRUCK789", 2000, "TRUCKPOLICY3729"));

        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.calculateRentalCost(3); // for 3 days
            v.calculateInsurance();
            v.getInsuranceDetails();
        }
    }
}
