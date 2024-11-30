package code;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        if (singleton != null) {
            throw new IllegalStateException("Already created.");
        }
    }

    public static Singleton getInstance() {
        return singleton;
    }

    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }

    private Object writeReplace() throws ObjectStreamException {
        return singleton;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }

    private static Class getClass(String className) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null) {
            classLoader = Singleton.class.getClassLoader();
        }

        return (classLoader.loadClass(className));
    }
}
