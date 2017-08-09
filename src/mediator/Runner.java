package mediator;

/**
 * mediator pattern:
 * centralize control logic to one class
 */
public class Runner {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Alarm alarm = new Alarm(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        mediator.setAlarm(alarm);
        mediator.setCoffeePot(coffeePot);

        alarm.ring();
    }
}
