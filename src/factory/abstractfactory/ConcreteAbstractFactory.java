package factory.abstractfactory;

public class ConcreteAbstractFactory implements AbstractFactory {
    @Override
    public Parts createParts() {
        return new RobotParts();
    }

    @Override
    public Wood createWood() {
        return new GreenWood();
    }
}
