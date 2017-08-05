package decorator;

public class HouseBland extends Beverage {
    public HouseBland(){
        description = "HomeBlend";
    }
    @Override
    public double cost() {
        return .89;
    }
}
