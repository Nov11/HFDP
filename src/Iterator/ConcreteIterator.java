package Iterator;

public class ConcreteIterator implements Iterator{
    int[] array;
    int index;
    public ConcreteIterator(int[] array){
        this.array = array;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Integer next() {
        return array[index++];
    }
}
