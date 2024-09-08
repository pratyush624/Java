/*
  2. Run-Time Polymorphism (Method Overriding):
     In this example, the Vehicle class has a move method that is overridden by its subclasses: Car and Bike.
     Each subclass provides its own specific implementation of the move method.

     - The Vehicle class defines a general move method.
     - The Car and Bike classes override the move method to provide their own behavior.

     This demonstrates run-time polymorphism where the method that gets called is determined at runtime,
     based on the actual object type, even if it’s referenced by the parent class (Vehicle).
*/
package Polymorphism.ExampleTwo;

class Vehicle {
    // General move method for Vehicle
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

