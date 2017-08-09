package mediator;

public class CoffeePot {
    private final Mediator mediator;

    public CoffeePot(Mediator mediator){
        this.mediator = mediator;
    }

    public void boilCoffee(){
        System.out.println("boiling coffee!");
    }

    public void Done(){
        mediator.inform(this);
    }
}
