package TestLoop;

import TestExtends.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLoop {

    public static void mian(String[] args) {


        List<Integer> c = new ArrayList<>();

        for(Iterator<Integer> it = c.iterator(); it.hasNext(); ) {
            it.next();
            it.remove();

        }

    }
}
