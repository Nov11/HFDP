package observer.JUtil;

import java.util.Observable;
import java.util.Observer;

public class JUtilObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg != null){
            System.out.println("get data:" + arg);
            return;
        }

        if(o instanceof JUtilObservable){
            JUtilObservable jo = (JUtilObservable)o;
            System.out.println("pull data:" + jo.getState());
        }
    }
}
