package builder;

import java.util.ArrayList;
import java.util.Date;

public class ConcreteBuilder implements AbstractBuilder {
    Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public ConcreteBuilder addItem(int i) {
        product.setItem(i);
        return this;
    }

    @Override
    public ConcreteBuilder addDate(Date date) {
        product.setDate(date);
        return this;
    }

    @Override
    public AbstractBuilder addList(ArrayList<Double> list) {
        product.setList(list);
        return this;
    }

    @Override
    public AbstractBuilder addDescription(String s) {
        product.setDescription(s);
        return this;
    }
}
