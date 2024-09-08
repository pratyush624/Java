package Polymorphism.Challenges.ChallengeOne;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        creditCardPayment.makePayment();
        payPalPayment.makePayment();
    }
}
