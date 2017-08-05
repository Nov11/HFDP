package observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Info info) {
        System.out.println(this.toString() + ":" + info.toString());
    }
}
