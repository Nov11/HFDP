package adaptor;

public class TurkeyAdaptorII implements Turkey, Duck {
    @Override
    public void quack() {
        gobble();
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void gobble() {
        System.out.println("gobble");
    }
}
