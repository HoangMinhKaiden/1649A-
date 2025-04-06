import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookCatalog {
    private List<String> books = new ArrayList<>(Arrays.asList(
        "Java Programming", "Python Basics", "Data Structures", 
        "Algorithms in Java", "Web Development"
    ));

    public void displayBooks() {
        System.out.println("Available Books: " + books);
    }

    public void sortBooks() {
        Collections.sort(books);
        System.out.println("Books sorted alphabetically: " + books);
    }

    public void searchBook(String title) {
        if (books.contains(title)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }
}
