import java.rmi.RemoteException;

public class LamportClockImplementation implements LamportClock {
	private int logicalClock;
	
	public LamportClockImplementation() throws RemoteException{
		super();
		this.logicalClock = 0;
	}
	
	public void showMessage()
	{
		System.out.print("Hello from client!");
	}
	
	@Override
	public void sendMessage(int timestamp) throws RemoteException{
		this.logicalClock = Math.max(this.logicalClock, timestamp + 1);
		
	}
	@Override
	public int getLogicalClock() throws RemoteException{
		return this.logicalClock;
	}

}
