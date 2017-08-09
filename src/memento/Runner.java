package memento;

/**
 * memento pattern:
 * not fancy, but it encapsulates the state info and provide retrieving and restoring method.
 */
public class Runner {
    public static void main(String[] args) {
        StateManager sm = new StateManager();
        State cur = sm.getCurrentState();
        sm.restorState(cur);
    }
}
