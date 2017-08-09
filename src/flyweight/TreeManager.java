package flyweight;

import javafx.util.Pair;

import java.util.ArrayList;

public class TreeManager {
    ArrayList<Pair<Integer, Integer>> list = new ArrayList<>();
    int age;

    public TreeManager(int age){
        this.age = age;
    }

    public void addTree(Pair<Integer, Integer> pair){
        list.add(pair);
    }

    public void display(){
        for(Pair<Integer, Integer> p : list){
            NTree.display(p.getKey(), p.getValue(), age);
        }
    }
}
