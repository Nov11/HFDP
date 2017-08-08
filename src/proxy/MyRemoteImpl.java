package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says hello!";
    }

    public static void main(String[] args) {
        try{
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("remote", myRemote);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }   catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
