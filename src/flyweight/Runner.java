package flyweight;

import javafx.util.Pair;

/**
 * flyweight pattern:
 * reduce memory consumption of one kind of object as small as weight of a fly.
 * extract the common parts, and store the different parts.
 * this saves memory than new every objects needed.
 *
 * this is useful when creating mass amount of objects that are similar
 */
public class Runner {
    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager(11);
        treeManager.addTree(new Pair(1,1));
        treeManager.addTree(new Pair(1,2));
        treeManager.addTree(new Pair(1,3));
        treeManager.display();

        Tree t1 = new Tree(1, 1, 11);
        Tree t2 = new Tree(1, 2, 11);
        Tree t3 = new Tree(1, 3, 11);
        t1.display();
        t2.display();
        t3.display();
    }
}
