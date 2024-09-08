package Polymorphism.Challenges.ChallengeTwo;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(10, 20));
        System.out.println(calculator.calculate(20.0, 30.2));
        System.out.println(calculator.calculate(100, 200, 300));
        System.out.println(calculator.calculate(20.2, 30.3, 40.3));
    }
}
