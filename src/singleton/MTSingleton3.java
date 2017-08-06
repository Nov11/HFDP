package singleton;

/**
 * double check
 */
public class MTSingleton3 {
    private volatile static MTSingleton3 instance;//you don't wanna see partially constructed objects, right?

    private MTSingleton3(){}

    public static MTSingleton3 getInstance(){
        if(instance == null){
            synchronized (MTSingleton3.class){
                if (instance == null) {
                    instance = new MTSingleton3();
                }
            }
        }

        return instance;
    }

}
