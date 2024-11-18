package ThisKeywordAndConstructor.Example1;

/*
* To Invoke Other Constructors: You can use this() to call another constructor
* within the same class, helping to avoid code duplication.
* */

public class Person {
    String name;
    int age;

    public Person(String name){
        this(name, 0);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


}
