package command;

/**
 * command pattern:
 * encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or
 * log requests, and support undoable operations.
 *
 * this pattern decouples invoker and receiver
 */
public class Runner {
    public static void main(String[] args) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);
        Invoker invoker = new Invoker();
        invoker.setCommand(c);
        invoker.invoke();
    }
}
