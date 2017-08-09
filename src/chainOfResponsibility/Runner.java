package chainOfResponsibility;

/**
 * chains of responsibility :
 * multi objects can have access to a common request.
 * this decouples sender of request of its receivers
 * elements in chain have no knowledge of other elements
 * behavior can be changed dynamically
 */
public class Runner {
    public static void main(String[] args) {
        Handler h1 = new FirstHandler();
        Handler h2 = new SecondHandler();
        h1.setSuccessor(h2);
        Request r = new Request();
        h1.handlerRequest(r);

        h1.setSuccessor(null);
        h1.handlerRequest(r);
    }
}
