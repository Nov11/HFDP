package state;

public class ConcreteState2 extends State{
    public ConcreteState2(Context context) {
        super(context);
    }

    @Override
    public void action2() {
        System.out.println("state 2 change context state to s3 by taking action2");
        context.setCurrentState(context.getS3());
    }
}
