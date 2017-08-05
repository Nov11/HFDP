package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    ArrayList<Observer> list = new ArrayList<>();
    Info info;
    @Override
    public void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : list){
            o.update(info);
        }
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
