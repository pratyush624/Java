package Abstraction.Example1;

abstract class Shape {
    // Abstract Method (No implementation)
    abstract void draw();

    // Concrete Method (With implementation)
    void display() {
        System.out.println("This is a shape.");
    }
}
