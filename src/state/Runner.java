package state;

/**
 * state pattern:
 * it allows an object to alter its behavior when its internal state changes.
 * the object will appear to change its class.
 */
public class Runner {
    public static void main(String[] args) {
        Context context = new Context();
        context.init();
        context.performAction1();
        context.performAction2();
        context.performAction3();
        context.performAction1();
    }
}
