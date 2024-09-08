/*
  2. Task: Create a program using method overriding to simulate a simple payment system.
  There are different types of payments, such as CreditCardPayment and PayPalPayment.
  Each payment method should have its own specific implementation of the makePayment
  method.

  1. Create a base class named `Payment` with a method called `makePayment()`.
     - The `makePayment()` method should print a general message like "Payment is being processed."

  2. Create two subclasses:
     - `CreditCardPayment` that extends `Payment` and overrides `makePayment()` to print "Processing credit card payment."
     - `PayPalPayment` that extends `Payment` and overrides `makePayment()` to print "Processing PayPal payment."

  3. In the `main` method, create objects of `CreditCardPayment` and `PayPalPayment`, but reference them as `Payment` type.
     - Call the `makePayment()` method on both objects.
     - Ensure that the correct overridden method is executed for each object.

  This task demonstrates method overriding, where subclasses provide their specific implementation
  of a method defined in the base class.
*/

package Polymorphism.Challenges.ChallengeOne;

public class Payment {
    public void makePayment(){
        System.out.println("Payment is being processed...");
    }
}
