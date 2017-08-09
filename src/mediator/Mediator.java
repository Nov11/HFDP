package mediator;

public class Mediator {
    Alarm alarm;
    CoffeePot coffeePot;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void setCoffeePot(CoffeePot coffeePot) {
        this.coffeePot = coffeePot;
    }

    public void inform(Object obj){
        if(obj instanceof CoffeePot){
            return;
        }
        if (obj instanceof Alarm) {
            coffeePot.boilCoffee();
        }
    }
}
