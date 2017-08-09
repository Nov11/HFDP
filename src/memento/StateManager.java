package memento;

public class StateManager {
    State s = new State();
    public State getCurrentState(){
        return s;
    }

    public void restorState(State state){
        s = state;
    }

}
