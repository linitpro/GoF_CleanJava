package Singleton;

public class Main {
    public static void main(String[] args) {
        // создадим объект-одиночку
        SingletonImpl singleton1 = SingletonImpl.instance("first initializing");
        System.out.println(singleton1.getName());
        // проверим, что был создан только один экземпляр
        SingletonImpl singleton2 = SingletonImpl.instance("second initializing");
        System.out.println(singleton2.getName());
    }
}
