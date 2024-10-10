package ClassAndObjects.ExampleTwo;

public class Book {
    String title;
    String author;
    int pages;

    public void displayDetails(){
        System.out.println("book's details - title: " + title + ", author: " +
                author + " and number of pages: " + pages );
    }
    public boolean isLengthy(){
        return pages > 300;
    }
}
