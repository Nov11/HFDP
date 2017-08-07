package Iterator;

/**
 * iterator pattern:
 * it allows traversal of elements of an aggregate without exposing the underlying implementation(array, list, etc.).
 * iterator takes the responsibility of traversing from aggregate type.
 *
 * this can be implemented in java.util.Iterator, too.
 */
public class Runner {
    public static void main(String[] args) {
        Aggregate a = new ConcreteAggregate();
        Iterator iter = a.createIterator();
        while(iter.hasNext()){
            int item = (Integer)iter.next();
            System.out.println(item);
        }
    }
}
