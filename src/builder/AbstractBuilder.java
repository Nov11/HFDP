package builder;

import java.util.ArrayList;
import java.util.Date;

public interface AbstractBuilder {
    Product build();
    AbstractBuilder addItem(int i);
    AbstractBuilder addDate(Date date);
    AbstractBuilder addList(ArrayList<Double> list);
    AbstractBuilder addDescription(String s);
}
