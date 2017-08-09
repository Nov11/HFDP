package mediator;

public class Alarm {
    Mediator mediator;
    public Alarm(Mediator mediator){
        this.mediator = mediator;
    }

    public void ring(){
        System.out.println("alarm rings!");
        mediator.inform(this);
    }
}
