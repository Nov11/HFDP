package composite;

public class ItemComponent extends Component {
    private String name;
    public ItemComponent(String name){
        this.name = name;
    }
    @Override
    void print() {
        System.out.println("this is item :" + name);
    }

    @Override
    String getName(){
        return name;
    }
}
