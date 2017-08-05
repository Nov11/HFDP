package strategy;

public class FlyNoWay implements FlyingBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
