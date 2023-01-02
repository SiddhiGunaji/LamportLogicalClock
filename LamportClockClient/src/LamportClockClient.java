import java.rmi.registry.*;

public class LamportClockClient {
	public static void main(String args[])
	{

		try {
		// specify local or remote ip
		
		String ip = "127.0.0.1";
		int port = 8081;
		
		Registry reg = LocateRegistry.getRegistry(ip, port);
		
		// stub creation
		LamportClock stub = (LamportClock)reg.lookup("LamportClock");

		stub.sendMessage(0);
		stub.sendMessage(0);
		stub.sendMessage(0);
		
		int logicalClock = stub.getLogicalClock();
		System.out.println("Logical call value: "+logicalClock);
		}
		
		catch (Exception e)
		{
			System.out.println("Err: "+e.toString());
		}
		
	}

}
