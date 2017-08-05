package strategy;

public abstract class Duck {
    private FlyingBehavior flyingBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {

    }

    public void performFly() {
        flyingBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Duck swim!");
    }

    public abstract void display();

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
