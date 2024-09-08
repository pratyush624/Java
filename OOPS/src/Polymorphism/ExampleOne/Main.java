package Polymorphism.ExampleOne;

public class Main {
    public static void main(String[] args) {
        // Create an object of Vehicle
        Vehicle myVehicle = new Vehicle();

        // Call the move method with no parameters
        myVehicle.move();            // Calls the first method

        // Call the move method with speed as a parameter
        myVehicle.move(60);          // Calls the second method

        // Call the move method with vehicle type as a parameter
        myVehicle.move("Car");       // Calls the third method
    }
}