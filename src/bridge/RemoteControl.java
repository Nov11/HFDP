package bridge;

public abstract class RemoteControl {
    Implementor impl;
    public RemoteControl(Implementor impl){
        this.impl = impl;
    }

    public void on(){
        impl.on();
    }

    public void off(){
        impl.off();
    }

    public void setChannle(int c){
        impl.tuneChannel(c);
    }
}
