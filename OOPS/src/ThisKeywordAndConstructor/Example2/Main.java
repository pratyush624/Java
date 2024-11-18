package ThisKeywordAndConstructor.Example2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pratyush");
        Car car = new Car("Kia");

        car.displayDriver(person);
    }
}
