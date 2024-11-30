package code;

public class SingletonMultithreaded {
    private static SingletonMultithreaded singletonMultithreaded = null;

    private SingletonMultithreaded() {
    }

    private static synchronized SingletonMultithreaded getInstance() {
        if (singletonMultithreaded == null) {
            singletonMultithreaded = new SingletonMultithreaded();
        }

        return singletonMultithreaded;
    }
}
