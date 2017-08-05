package factory;

public class Runner {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product p1 = creator.getProduct(1);
        Product p2 = creator.getProduct(2);
    }
}
