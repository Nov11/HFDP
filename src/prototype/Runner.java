package prototype;

/**
 * prototype pattern:
 * get new instance by copying from existing one
 * applicable when creating is expensive or time-consuming
 */
public class Runner {
    public static void main(String[] args) {
        ItemRegistry ir = new ItemRegistry();
        Item i = ir.getItem();
    }
}
