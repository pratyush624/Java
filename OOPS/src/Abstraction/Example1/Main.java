package Abstraction.Example1;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        rectangle.display();
        square.display();

        rectangle.draw();
        square.draw();
    }
}
