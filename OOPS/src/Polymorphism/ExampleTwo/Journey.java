package Polymorphism.ExampleTwo;

class Journey {
    // Method that starts the journey by calling the move method on any Vehicle
    public void startJourney(Vehicle vehicle) {
        vehicle.move(); // Calls the appropriate move method based on the actual object (Car or Bike)
    }
}