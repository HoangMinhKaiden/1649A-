import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OnlineBookstoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        BookCatalog bookCatalog = new BookCatalog();

        while (true) {
            System.out.println("\n=== Online Bookstore ===");
            System.out.println("1. Display Books");
            System.out.println("2. Sort Books");
            System.out.println("3. Search Book");
            System.out.println("4. Place Order");
            System.out.println("5. Process Order");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    bookCatalog.displayBooks();
                    break;
                case 2:
                    bookCatalog.sortBooks();
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String title = scanner.nextLine();
                    bookCatalog.searchBook(title);
                    break;
                case 4:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter shipping address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter books (comma-separated): ");
                    List<String> bookList = Arrays.asList(scanner.nextLine().split(","));
                    orderManager.placeOrder(name, address, bookList);
                    break;
                case 5:
                    orderManager.processOrder();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
