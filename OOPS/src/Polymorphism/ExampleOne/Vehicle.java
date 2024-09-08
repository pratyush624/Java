/*
  1. Compile-Time Polymorphism (Method Overloading):
     In this example, the Vehicle class has overloaded move methods that accept different parameters.
     Each overloaded method behaves differently based on the arguments passed.

     - The first method has no parameters and prints a default message.
     - The second method accepts an integer to represent speed.
     - The third method accepts a string to represent the type of vehicle.

     This is an example of compile-time polymorphism where the correct method is chosen based on method signature.
*/
package Polymorphism.ExampleOne;

class Vehicle {
    // Overloaded move method with no parameters
    public void move() {
        System.out.println("Vehicle is moving");
    }

    // Overloaded move method with an integer parameter (speed)
    public void move(int speed) {
        System.out.println("Vehicle is moving at speed: " + speed + " km/h");
    }

    // Overloaded move method with a string parameter (vehicle type)
    public void move(String type) {
        System.out.println(type + " is moving");
    }
}


