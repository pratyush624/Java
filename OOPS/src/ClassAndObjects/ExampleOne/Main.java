package ClassAndObjects.ExampleOne;

public class Main {
    public static void main(String[] args) {
        // Create objects (instances) of the Car
        Car car1 = new Car();
        Car car2 = new Car();

        // Assign values to the attributes
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2022;

        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        // Access object attributes and methods
        car1.displayInfo();  // Output: Car: Toyota Camry, Year: 2022
        car2.startEngine();  // Output: The Civic's engine has started.
    }
}
