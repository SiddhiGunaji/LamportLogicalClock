import java.rmi.*;

public interface LamportClock extends Remote {
	
	void showMessage() throws RemoteException;
	void sendMessage(int timestamp) throws RemoteException;
	int getLogicalClock() throws RemoteException;
}
