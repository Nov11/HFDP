package chainOfResponsibility;

public class SecondHandler extends Handler {
    @Override
    public void handlerRequest(Request request) {
        System.out.println("second handler running");
        super.handlerRequest(request);
    }
}
