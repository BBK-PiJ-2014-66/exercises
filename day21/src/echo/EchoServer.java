package echo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EchoServer() throws RemoteException {
		
	}

	@Override
	public String echo(String s) throws RemoteException {
		System.out.println("replied to some client saying '" + s + "'");
		return s;
	}

}
