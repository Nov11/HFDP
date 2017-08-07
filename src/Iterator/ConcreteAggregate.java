package Iterator;

public class ConcreteAggregate implements Aggregate {
    int[] array;
    public ConcreteAggregate(){
        array = new int[10];
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(array);
    }
}
