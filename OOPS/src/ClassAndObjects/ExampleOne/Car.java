package ClassAndObjects.ExampleOne;

public class Car {
    String brand;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }

    // Method to simulate starting the car
    public void startEngine() {
        System.out.println("The " + model + "'s engine has started.");
    }
}
