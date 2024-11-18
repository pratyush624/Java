package StaticKeyword.Example2;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        System.out.println(Counter.count); // Output: 2, shared by both instances

    }
}
