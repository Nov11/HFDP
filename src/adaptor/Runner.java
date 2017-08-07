package adaptor;

/**
 * adapter pattern:
 * it converts the interface of a class to another interface the client expect.
 * here it converts Turkey interface to Duck.
 *
 * TurkeyAdaptor is a object adaptor, which utilize composition.
 * TurkeyAdaptorII is a class adaptor, which implements both interfaces.
 */
public class Runner {
    public static void main(String[] args) {
        Turkey t = new WildTurkey();

        Duck d = new TurkeyAdapter(t);
        d.fly();
        d.quack();

        TurkeyAdaptorII ta2 = new TurkeyAdaptorII();
        Duck d2 = ta2;
        d2.fly();
        d2.quack();
        Turkey t2 = ta2;
        t2.fly();
        t2.gobble();
    }
}
