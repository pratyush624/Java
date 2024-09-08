package Polymorphism.Challenges.ChallengeOne;

import Polymorphism.Challenges.ChallengeOne.Payment;

public class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment.");
    }
}
