package composite;


/**
 * composite pattern:
 * compose objects to tree structure so that individual objects and composite objects can be treat uniformly.
 */
public class Runner {
    public static void main(String[] args) {
        CompositeComponent c = new CompositeComponent("top level c1");
        CompositeComponent c2 = new CompositeComponent("first on second level c2");
        CompositeComponent c3 = new CompositeComponent("second on second level c3");
        CompositeComponent c4 = new CompositeComponent("first on third level c4");
        ItemComponent i1 = new ItemComponent("1");
        ItemComponent i2 = new ItemComponent("2");
        ItemComponent i3 = new ItemComponent("3");
        ItemComponent i4 = new ItemComponent("4");
        ItemComponent i5 = new ItemComponent("5");
        ItemComponent i6 = new ItemComponent("6");

        c.add(c2);
        c.add(c3);
        c.add(i6);

        c2.add(i1);
        c2.add(i2);

        c3.add(c4);
        c3.add(i3);
        c4.add(i4);
        c4.add(i5);

        c.print();

        System.out.println("==================================");
        Iterator iterator = c.createIterator();
        while (iterator.hashNext()) {
            Component tmp = (Component) iterator.next();
            System.out.println(tmp.getName());
        }
    }
}
