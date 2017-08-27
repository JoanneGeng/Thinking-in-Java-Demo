package TestExtendClassCover;

/**
 * Time      2017/8/27 下午9:42
 * Author    JoanneGeng
 * File      Egg2.java
 * Software  IntelliJ IDEA
 */
public class Egg2 {
    protected class Yolk {

        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    private Yolk y = new Yolk();

    public Egg2() {
        System.out.println("New Egg2");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }

}
