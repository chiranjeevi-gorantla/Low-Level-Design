import controller.ShoppingCart;
import model.CreditCardAlgorithm;
import model.PaypalAlgorithm;
import model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product dogs = new Product(500, "123");
        Product cats = new Product(300, "456");

        shoppingCart.addProduct(dogs);
        shoppingCart.addProduct(cats);

        shoppingCart.pay(new PaypalAlgorithm("paypal@gmail.com", "paypal45"));

        shoppingCart.pay(new CreditCardAlgorithm("credit@gmail.com", "credit123"));
    }
}