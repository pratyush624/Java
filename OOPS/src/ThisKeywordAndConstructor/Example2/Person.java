package ThisKeywordAndConstructor.Example2;

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    void showInfo(){
        System.out.println("Peron name is : " + this.name);
    }
}
