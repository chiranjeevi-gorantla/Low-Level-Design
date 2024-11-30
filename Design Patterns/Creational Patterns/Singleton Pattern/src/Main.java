import code.SingletonEnum;

public class Main {
    public static void main(String[] args) {
        SingletonEnum.SingleEnum instance = SingletonEnum.SingleEnum.SINGLE_ENUM;
        System.out.println("Singleton Instance: " + instance);
    }
}