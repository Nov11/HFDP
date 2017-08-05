package factory.abstractfactory;

/**
 * this is demo for abstract factory.
 * this pattern is to create a set of objects of certain concrete types.
 * and also, one abstract factory makes user depend on factory interface rather than detailed types it creates.
 * e.g.
 * someobj.parts = c.createParts();
 * someobj.wood = c.createWood();
 */
public class Runner {
    public static void main(String[] args) {
        ConcreteAbstractFactory c = new ConcreteAbstractFactory();
        Parts p = c.createParts();
        Wood w = c.createWood();
        if( p instanceof RobotParts && w instanceof GreenWood){
            System.out.println("Correct");
        }else{
            System.out.println("concrete objects type is not right");
        }
    }
}
