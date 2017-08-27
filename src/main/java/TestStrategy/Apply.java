package TestStrategy;

/**
 * 策略模式，根据所传的参数对象不同而具有不同的行为的方法，策略设计模式
 */
public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Process " + p.name());
        System.out.println(p.process(s));
    }

    public static String s =
            "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
    }

}
