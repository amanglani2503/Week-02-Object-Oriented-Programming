package MultilevelInheritance;

// Base class Order
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed, waiting to be shipped.";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass ShippedOrder extends Order
class ShippedOrder extends Order {
    private final String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// Subclass DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private final String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

// Main class
public class OrderManagement {
    public static void main(String[] args) {
        // Create objects of each class
        Order order = new Order("ORD001", "2025-01-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-01-05", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-01-10", "TRK67890", "2025-01-12");

        // Display the details and status of each order
        System.out.println("Order 1:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        System.out.println("Order 2:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println("Order 3:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
