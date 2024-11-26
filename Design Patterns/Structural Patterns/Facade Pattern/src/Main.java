import facade.Inventory;
import facade.OrderFacade;
import facade.Payment;
import facade.Shipping;

public class Main {
    public static void main(String[] args) {
        //Without Facade Pattern
        System.out.println("Without Facade Pattern: ");
        Inventory inventory = new Inventory();
        inventory.checkStock("Iphone");
        Payment payment = new Payment();
        payment.makePayment("Iphone");
        Shipping shipping = new Shipping();
        shipping.arrangeShipping("Iphone");

        //With Facade Pattern
        System.out.println("With Facade Pattern: ");
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("MacBook");
    }
}