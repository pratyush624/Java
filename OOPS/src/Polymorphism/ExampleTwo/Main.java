package Polymorphism.ExampleTwo;

public class Main {
    public static void main(String[] args) {
        // Create objects for Car and Bike, referencing them with the Vehicle type
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        // Create a Journey object
        Journey journey = new Journey();

        // Start journey with Car
        journey.startJourney(myCar);   // Output: Car is moving

        // Start journey with Bike
        journey.startJourney(myBike);  // Output: Bike is moving
    }
}
