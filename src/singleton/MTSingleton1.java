package singleton;

/**
 * synchronized
 */
public class MTSingleton1 {
    private static MTSingleton1 mtSingleton1;

    private MTSingleton1(){}

    public synchronized static MTSingleton1 getInstance(){
        if(mtSingleton1 == null){
            mtSingleton1 = new MTSingleton1();
        }
        return mtSingleton1;
    }
}
