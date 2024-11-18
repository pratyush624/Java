package ThisKeywordAndConstructor.Example1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Pratyush");
        Person person2 = new Person("Aditya", 24);

        System.out.println("Person1 -> " + "name " + person1.name + " age " + person1.age);
        System.out.println("Person2 -> " + "name " + person2.name + " age " + person2.age);

    }
}
