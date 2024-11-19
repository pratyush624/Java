package Interface.Example1;

public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }

    @Override
    public void convertCurrency(double amount, String fromCurrency, String toCurrency) {
        PaymentProcessor.super.convertCurrency(amount, fromCurrency, toCurrency);
    }
}
