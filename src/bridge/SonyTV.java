package bridge;

public class SonyTV implements Implementor {
    @Override
    public void on() {
        System.out.println("sony tv on");
    }

    @Override
    public void off() {
        System.out.println("sony tv off");
    }

    @Override
    public void tuneChannel(int n) {
        System.out.println("sony tv change channel to " + n);
    }
}
