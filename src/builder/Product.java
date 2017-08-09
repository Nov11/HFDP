package builder;

import java.util.ArrayList;
import java.util.Date;

public class Product {
    int item;
    Date date;
    ArrayList<Double> list;

    String description;

    public Product(){

    }

    public Product(int item, Date date, ArrayList<Double> list) {
        this.item = item;
        this.date = date;
        this.list = list;
    }

    public void setDescription(String s){
        description = s;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item=" + item +
                ", date=" + date +
                ", list=" + list +
                ", description='" + description + '\'' +
                '}';
    }
}
