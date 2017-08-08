package state;

public class ConcreteState1 extends State {
    public ConcreteState1(Context context){
        super(context);
    }
    @Override
    public void action1() {
        System.out.println("state1: change context state to state2");
        context.setCurrentState(context.getS2());
    }

}
