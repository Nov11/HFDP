package state;

public class ConcreteState3 extends State {
    public ConcreteState3(Context context) {
        super(context);
    }

    @Override
    public void action3() {
        System.out.println("s3 restore state to s1 by taking action3");
        context.setCurrentState(context.getS1());
    }
}
