package strategy;

public class Simulator {
    /*
    * Strategy pattern: defines a family of algorithms, encapsulates each one, and makes them interchangeable.
    * Strategy lets the algorithm vary independently from clients that use it.
    */
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyingBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squeak());

        duck.performQuack();
        duck.performFly();
    }
}
