package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


/**
* proxy pattern:
 * it provides a surrogate or placeholder for another object to control access to it.
 *
 * in order to run this:
 * cd to src dir
 * 'javac' every .java file in proxy
 * call rmic proxy.MyRemoteImpl
 * in the src dir, call rmiregistry, start MyRemoteImpl, and then run Client
 * pay attention to the path when runs a command.
 *
 * I haven't figure out how this is done in IDEA. As I rarely use rmi, it's ok to left it there.
*/

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRemote myremote = (MyRemote) Naming.lookup("rmi://127.0.0.1/remote");
        String s = myremote.sayHello();
        System.out.println("get from remote : " + s);
    }
}
