package TestStrategy;

public class UpCase extends Processor {

    String process(Object input) {
        return ((String ) input).toUpperCase();
    }
}
