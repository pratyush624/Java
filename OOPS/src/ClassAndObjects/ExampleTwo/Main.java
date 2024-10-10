package ClassAndObjects.ExampleTwo;

public class Main {
    public static void main(String[] args) {
        // Creating the first Book object
        Book book1 = new Book();
        book1.title = "2 States";
        book1.author = "Chetan Bhagat";
        book1.pages = 400;

        book1.displayDetails();  // Display book details
        System.out.println("Is the book lengthy? " + book1.isLengthy());  // Check if it's lengthy

        // Creating the second Book object
        Book book2 = new Book();
        book2.title = "Animal Farm";
        book2.author = "George Orwell";
        book2.pages = 112;

        book2.displayDetails();  // Display book details
        System.out.println("Is the book lengthy? " + book2.isLengthy());  // Check if it's lengthy
    }
}
