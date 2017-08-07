package composite;

public abstract class Component {
    abstract void print();
    void add(Component s){throw new UnsupportedOperationException();}
    String  getName(){throw new UnsupportedOperationException();}
    Iterator createIterator(){throw new UnsupportedOperationException();}
}
