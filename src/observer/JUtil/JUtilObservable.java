package observer.JUtil;

import java.util.Observable;

public class JUtilObservable extends Observable {
    int state = 0;
    public void changeStateAndNotify(){
        state++;
        setChanged();
        notifyObservers();
    }

    public void changeStateAndNotify(int newState){
        state = newState;
        setChanged();
        notifyObservers(state);
    }

    public int getState(){return state;}

    public static void main(String[] args) {
        JUtilObservable js = new JUtilObservable();
        JUtilObserver jo = new JUtilObserver();

        js.addObserver(jo);
        js.changeStateAndNotify();

        js.changeStateAndNotify(10);

    }
}

