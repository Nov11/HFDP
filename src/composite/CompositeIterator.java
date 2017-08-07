package composite;

import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iter) {
        stack.push(iter);
    }

    @Override
    public Object next() {
//        if (!hashNext()) {
//            return null;
//        }
        Iterator iter = stack.peek();
        Component c = (Component)iter.next();
        if (c instanceof CompositeComponent) {
            CompositeIterator ci = (CompositeIterator)c.createIterator();
            stack.push(ci.stack.peek());
        }
        return c;
    }

    @Override
    public boolean hashNext() {
        if(stack.empty()){
            return false;
        }
        Iterator tmp = stack.peek();
        if(tmp.hashNext()){
            return true;
        }
        stack.pop();
        return hashNext();
    }
}
