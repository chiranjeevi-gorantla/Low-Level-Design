import code.carPackage.Audi;
import code.carPackage.Bmw;
import code.carPackage.Car;
import code.productPackage.CentralLocking;
import code.productPackage.GearLocking;
import code.productPackage.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");

        Car car = new Bmw(product1, "BMW 3 Series 330i");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Bmw(product2, "BMW 3 Series 330i");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Audi(product1, "Audi Q5");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Audi(product2, "Audi Q5");
        car.produceProduct();
        car.assemble();
        car.printDetails();
    }
}