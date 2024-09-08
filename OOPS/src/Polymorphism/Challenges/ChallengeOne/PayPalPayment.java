package Polymorphism.Challenges.ChallengeOne;

import Polymorphism.Challenges.ChallengeOne.Payment;

public class PayPalPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing PayPal payment.");
    }
}
