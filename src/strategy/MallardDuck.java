package strategy;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyingBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    @Override
    public void display() {
        System.out.println("This is a Mallard duck!");
    }
}
