package code.carPackage;

import code.productPackage.Product;

public abstract class Car {

    private final Product product;
    private final String carType;

    public Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails() {
        System.out.println("Car type: " + carType + " Product: " + product.productName());
    }
}
