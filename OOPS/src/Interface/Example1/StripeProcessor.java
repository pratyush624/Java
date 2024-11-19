package Interface.Example1;

// Implementation class for Stripe
class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
