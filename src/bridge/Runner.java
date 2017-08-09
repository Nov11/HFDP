package bridge;

/**
 * bridge pattern:
 * RemoteControl serves as abstraction, implementor is implementation.
 * by using this pattern, abstraction and implementation can evolve independently.
 *
 * When comes to my thought, well, is this really a pattern?
 */
public class Runner {
    public static void main(String[] args) {
        Implementor s = new SonyTV();
        ConcreteRemoteControl r = new ConcreteRemoteControl(s);
        r.nextChannel();
    }
}
