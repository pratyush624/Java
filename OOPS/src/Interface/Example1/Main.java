package Interface.Example1;

/*
Scenario: Payment System Interface
Abstract Method: Enforces essential operations like processing payments.
Default Method: Provides optional behavior such as handling currency conversion,
                which might not be overridden by every payment processor.
Static Method: Provides utility logic like validating card numbers, which is independent of the instance.
Private Methods: Encapsulate shared logic used internally by default or static methods
*/

public class Main {
    public static void main(String[] args) {
        // Create instances of payment processors
        PaymentProcessor paypal = new PayPalProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        // Process payments
        paypal.processPayment(100.0);
        stripe.processPayment(200.0);

        // Use default method for currency conversion
        paypal.convertCurrency(100.0, "USD", "EUR");

    }
}