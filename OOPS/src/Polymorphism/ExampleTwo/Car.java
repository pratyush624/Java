package Polymorphism.ExampleTwo;

class Car extends Vehicle {
    // Override the move method for Car
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}