package StaticKeyword;

class Example {
    static int value;

    static {
        value = 10; // Static block runs when the class is loaded
    }
}