package composite;

import java.util.ArrayList;

public class CompositeComponent extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    private String name;
    public CompositeComponent(String s){
        this.name = s;
    }
    @Override
    void add(Component s) {
        list.add(s);
    }

    @Override
    void print() {
        System.out.println("this is one composite:" + name);
        for(Component c : list){
            c.print();
        }
    }

    @Override
    String getName(){
        return name;
    }

    @Override
    Iterator createIterator() {
        return new CompositeIterator(new IteratorFacade(list.iterator()));
    }
}
