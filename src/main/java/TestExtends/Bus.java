package TestExtends;

public class Bus extends Car {

    private int num;

    public Bus(String name, int num) {
        super(name);
        this.num = num;
    }

    public void change(String name, int num) {
        setName(name);
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bus" + num + ":" +super.toString();
    }

    public static void main(String[] args) {
        Bus bus = new Bus("Hello World",10);
        System.out.println(bus);
        bus.change("World，because Hello escaped",9);
        System.out.println(bus);
    }
}
