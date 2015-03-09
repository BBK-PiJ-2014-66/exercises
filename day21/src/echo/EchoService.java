package echo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EchoService extends Remote {
	/**
	 * Returns the same string passed as parameter
	 * @param str a string
	 * @return the same string passed as parameter
	 * @throws RemoteException on problem
	 */
	
	public String echo(String s) throws RemoteException;
}
