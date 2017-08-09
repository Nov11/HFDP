package builder;

import java.util.ArrayList;
import java.util.Date;

/**
 * builder pattern:
 * encapsulate the construction of a object and allow it to be constructed in steps.
 */
public class Runner {
    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder();
        builder.addDate(new Date()).addItem(11).addList(new ArrayList<>()).addDescription("des");
        Product p = builder.build();
        System.out.println(p);
    }
}
