import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {
    private Queue<Order> orderQueue = new LinkedList<>();
    private int orderCounter = 1;

    public void placeOrder(String customerName, String shippingAddress, List<String> books) {
        Order order = new Order(orderCounter++, customerName, shippingAddress, books);
        orderQueue.add(order);
        System.out.println("Order placed: " + order);
    }

    public void processOrder() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Processing: " + orderQueue.poll());
        } else {
            System.out.println("No orders to process.");
        }
    }
}

