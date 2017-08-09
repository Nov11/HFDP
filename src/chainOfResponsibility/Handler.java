package chainOfResponsibility;

public class Handler {
    Handler successor;

    public void handlerRequest(Request request) {
        if (successor != null) {
            successor.handlerRequest(request);
        }
    }

    public void setSuccessor(Handler handler){
        successor = handler;
    }

    public Handler(Handler successor){
        this.successor = successor;
    }

    public Handler(){

    }
}
