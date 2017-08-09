package bridge;

public class ConcreteRemoteControl extends RemoteControl {
    public ConcreteRemoteControl(Implementor impl) {
        super(impl);
    }
    int currentChannel = 1;

    public void nextChannel(){
        impl.tuneChannel(++currentChannel);
    }
}
