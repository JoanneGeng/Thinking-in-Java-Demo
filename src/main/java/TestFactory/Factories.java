package TestFactory;

public class Factories {

    public static void serviceConsumer(ServiceFactory fac) {
        Service s = fac.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {

        serviceConsumer(Implementation.factory);

        serviceConsumer(Implementation2.factory);
    }
}
