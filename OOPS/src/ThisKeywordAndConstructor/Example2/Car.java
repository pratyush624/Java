package ThisKeywordAndConstructor.Example2;

public class Car {
    String model;
    Car(String model){
        this.model = model;
    }
    //    A method displayDriver(Person person) that
    //    prints the car's model and the name of the person driving it.
    void displayDriver(Person person){
        System.out.println("Car model is : " + this.model);
        person.showInfo();
    }
}
