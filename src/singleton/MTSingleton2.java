package singleton;

/**
 * eager initialization
 */
public class MTSingleton2 {
    private static MTSingleton2 instance = new MTSingleton2();
    private MTSingleton2(){}
    public static MTSingleton2 getInstance(){
        return instance;
    }
}
