package state;

public abstract class State {
    Context context;
    public State(Context context){
        this.context = context;
    }

    public void action1() {
        throw new UnsupportedOperationException();
    }


    public void action2() {
        throw new UnsupportedOperationException();
    }


    public void action3() {
        throw new UnsupportedOperationException();
    }
}
