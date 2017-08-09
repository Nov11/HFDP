package chainOfResponsibility;

public class FirstHandler extends Handler {
    @Override
    public void handlerRequest(Request request) {
        System.out.println("first handler running");
        super.handlerRequest(request);
    }
}
