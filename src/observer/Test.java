package observer;

/**
 * Observer pattern:
 * it defines a one to many dependency when subject changes the observers get notified and updated automatically
 *
 * this is a push version. since info is the only object represents state, this can also be taken as one pull version.
 * in JUtil package there is a pull version.
 *
 * push means subject push its whole states to observers. typically pass many states through many params. it's annoying
 * for observers who only care little portion of the whole state. so comes the pull version.
 * pull means observer read states it cares from subject.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject();
        Observer o1 = new ConcreteObserver();
        Observer o2 = new ConcreteObserver();
        cs.addObserver(o1);
        cs.addObserver(o2);

        Info info = new Info();
        info.id = 1;
        cs.setInfo(info);
        cs.notifyObservers();

        Observer o3 = new ConcreteObserver();
        cs.addObserver(o3);

        info.id++;
        cs.setInfo(info);
        cs.notifyObservers();

        cs.removeObserver(o1);
        cs.removeObserver(o3);
        info.id++;
        cs.setInfo(info);
        cs.notifyObservers();
    }
}
