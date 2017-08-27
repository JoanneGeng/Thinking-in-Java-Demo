package TestFactory;

public class Implementation implements Service {

    private Implementation() {};

    @Override
    public void method1() {
        System.out.println("Implementation method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation();
        }
    };

}
