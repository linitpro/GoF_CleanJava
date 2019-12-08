package Singleton;

public class SingletonImpl {
    private static SingletonImpl singleton;

    public static SingletonImpl instance(String name) {
        if (singleton == null) {
            singleton = new SingletonImpl(name);
        }
        return SingletonImpl.singleton;
    }

    private String name;
    private SingletonImpl() {
        this.name = "rand";
    }
    private SingletonImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
