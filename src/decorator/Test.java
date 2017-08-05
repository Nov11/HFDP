package decorator;

/**
 * Decorator:
 * add functionalities dynamically.
 */
public class Test {
    static void detail(Beverage beverage){
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        detail(beverage);

        Beverage beverage1 = new HouseBland();
        beverage1 = new Mocha(beverage1);
        detail(beverage1);


    }
}
