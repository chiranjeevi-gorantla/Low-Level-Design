package facade;

public class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void placeOrder(String product) {
        inventory.checkStock(product);
        payment.makePayment(product);
        shipping.arrangeShipping(product);
        System.out.println("Order placed successfully for: " + product);
    }
}
