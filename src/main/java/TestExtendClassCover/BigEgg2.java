package TestExtendClassCover;

/**
 * Time      2017/8/27 下午9:53
 * Author    JoanneGeng
 * File      BigEgg2.java
 * Software  IntelliJ IDEA
 */
public class BigEgg2 extends Egg2 {

    public class Yolk extends Egg2.Yolk {

        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        public void f() {
            System.out.println("BigEgg2.Yoly.f()");
        }

    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new Egg2();
        e2.g();
    }

    /**
     * 书上的输出 p213
     * Egg2.Yolk()
     * New Egg2()
     * Egg2.Yolk()
     * BigEgg2.Yolk()
     * BigEgg2.Yolk.f()
     */


}
