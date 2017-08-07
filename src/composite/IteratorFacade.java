package composite;

public class IteratorFacade implements Iterator {
    java.util.Iterator<Component> iter;
    public IteratorFacade(java.util.Iterator<Component> iter){
        this.iter = iter;
    }
    @Override
    public Object next() {
        if(hashNext()){
            return iter.next();
        }
        return null;
    }

    @Override
    public boolean hashNext() {
        return iter.hasNext();
    }
}
