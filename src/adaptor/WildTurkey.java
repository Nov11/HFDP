package adaptor;

public class WildTurkey implements Turkey {
    @Override
    public void fly() {
        System.out.println("Wild Turkey fly!");
    }

    @Override
    public void gobble() {
        System.out.println("Wild Turkey gobble!");
    }
}
