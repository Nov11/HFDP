package singleton;


/**
 * singleton :
 * ensure that a class has only one instance and provides one global point of access to it
 */
public class SingleThreadOnly {
    static private SingleThreadOnly instance;
    private SingleThreadOnly(){}
    public static SingleThreadOnly getInstance(){
        if(instance == null){
            instance = new SingleThreadOnly();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleThreadOnly o1 = SingleThreadOnly.getInstance();
        SingleThreadOnly o2 = SingleThreadOnly.getInstance();
        if(o1 == o2){
            System.out.println("they are the same object.");
        }else{
            System.out.println("they are not same!");
        }
    }
}
