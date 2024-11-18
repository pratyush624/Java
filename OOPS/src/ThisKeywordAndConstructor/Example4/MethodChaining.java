package ThisKeywordAndConstructor.Example4;

public class MethodChaining {
    private int value;

    // Method to set a value
    MethodChaining setValue(int val) {
        this.value = val; // Assign value to class variable
        return this;      // Return current object for chaining
    }

    // Method to increment the value
    MethodChaining incrementValue() {
        this.value += 1;
        return this;      // Return current object for chaining
    }

    // Method to display the value
    void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        MethodChaining chaining = new MethodChaining();

        // Chaining the method calls
        chaining.setValue(10).incrementValue().displayValue(); // Output: Value: 11
    }
}
