package TestStrategy;

public class DownCase extends Processor {

    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
