package template;

public class ConcreteTemplate extends Template {
    @Override
    protected void procedure1() {
        System.out.println("p1");
    }

    @Override
    protected void procedure3() {
        System.out.println("p2");
    }
}
