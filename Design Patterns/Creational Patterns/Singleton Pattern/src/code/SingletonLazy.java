package code;

public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
