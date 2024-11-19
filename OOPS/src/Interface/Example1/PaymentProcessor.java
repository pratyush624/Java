package Interface.Example1;

interface PaymentProcessor {
    // Abstract method
    void processPayment(double amount);

    // Default method
    default void convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double convertedAmount = conversionRate(fromCurrency, toCurrency) * amount;
        System.out.println("Converted Amount: " + convertedAmount + " " + toCurrency);
    }

    // Static method
    static boolean validateCard(String cardNumber) {
        System.out.println("Validating card: " + cardNumber);
        return cardNumber.length() == 16 && cardNumber.startsWith("4"); // Example logic: 16-digit Visa cards
    }

    // Private method (used internally for currency conversion)
    private double conversionRate(String fromCurrency, String toCurrency) {
        // Dummy conversion rates for demonstration
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) return 0.85;
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) return 1.15;
        return 1.0; // Default 1:1 conversion
    }

    // Private static method (used internally for card validation utilities)
    private static void logValidation(String cardNumber, boolean isValid) {
        System.out.println("Card Validation Log: " + cardNumber + " is " + (isValid ? "valid" : "invalid"));
    }
}
