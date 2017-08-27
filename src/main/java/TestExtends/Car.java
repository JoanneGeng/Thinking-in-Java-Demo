package TestExtends;

public class Car {

    private String name;

    protected void setName(String na) {
        name = na;
    }

    public Car(String name) {
        this.name = name;
    }

    public String toString() {
        return "I'm a Car and my name is " + name;
    }
}
