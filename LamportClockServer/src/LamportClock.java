import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LamportClock extends Remote {
	
	void sendMessage(int timestamp) throws RemoteException;
	int getLogicalClock() throws RemoteException;
}
