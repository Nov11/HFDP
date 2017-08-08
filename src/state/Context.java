package state;

public class Context {
    State s1;
    State s2;
    State s3;

    State cur;

    public Context(){

    }

    public void init(){
        s1 = new ConcreteState1(this);
        s2 = new ConcreteState2(this);
        s3 = new ConcreteState3(this);
        cur = s1;
    }

    public void performAction1(){
        cur.action1();
    }

    public void performAction2(){
        cur.action2();
    }

    public void performAction3(){
        cur.action3();
    }

    public void setCurrentState(State s){
        cur = s;
    }

    public State getS1() {
        return s1;
    }

    public State getS2() {
        return s2;
    }

    public State getS3() {
        return s3;
    }
}
