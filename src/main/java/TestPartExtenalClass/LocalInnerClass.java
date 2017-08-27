package TestPartExtenalClass;

import java.util.SplittableRandom;

/**
 * Time      2017/8/27 下午10:48
 * Author    JoanneGeng
 * File      LocalInnerClass.java
 * Software  IntelliJ IDEA
 */
public class LocalInnerClass {
    private int count = 0;

    Count getCount(final String name) {
        class LocalCount implements Count {
            public LocalCount() {
                System.out.println("LocalCount()");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        return new LocalCount();
    }

    Count getCount2(final String name) {
        return new Count() {

            {
                System.out.println("Count()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Count c1 = lic.getCount("Local inner");
        Count c2 = lic.getCount2("Anonymous inner");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }



}
