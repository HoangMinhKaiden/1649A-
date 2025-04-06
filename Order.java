import java.util.List;

public class Order {
    int orderId;
    String customerName;
    String shippingAddress;
    List<String> books;
    
    public Order(int orderId, String customerName, String shippingAddress, List<String> books) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.books = books;
    }

    @Override
    public String toString() {
        return "[Order ID: " + orderId + ", Customer: " + customerName + ", Books: " + books + "]";
    }
}
