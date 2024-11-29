package code.carPackage;

import code.productPackage.Product;

public class Bmw extends Car {
    private final Product product;
    private final String carType;

    public Bmw(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + product.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Modifing product " + product.productName() + " according to " + carType);
    }
}
