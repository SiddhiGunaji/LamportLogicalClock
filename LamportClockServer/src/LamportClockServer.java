import java.rmi.RemoteException;
import java.rmi.registry.*;
import java.rmi.server.*;

public class LamportClockServer{
	
	public static void main(String args[]) throws RemoteException {
	
		String ip = "127.0.0.1";
		System.setProperty("java.rmi.server.hostname",ip);
		Registry reg = null;
		int port = 8081;
		
		try {

			reg = LocateRegistry.createRegistry(port);
		}
		
		catch (Exception ce) {
			System.out.println();
			System.out.println("Error: "+ce.toString());
		}

		LamportClockImplementation hi = new LamportClockImplementation();
		try {
			LamportClock stub = (LamportClock) UnicastRemoteObject.exportObject(hi, 0);

			reg.rebind("LamportClock", stub);
			System.out.println("Server has been started.");
		}
		catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		return;
	}
}
