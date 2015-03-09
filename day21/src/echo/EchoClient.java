package echo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class EchoClient {
	EchoClient() {

	}

	public static void main(String args[]) {
		EchoClient ec = new EchoClient();
		ec.launch();
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			EchoService echoService = (EchoService) service;
			String receivedEcho = echoService.echo("Hello World");
			System.out.print("receivedEcho =" + receivedEcho + "\n");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void launch() {
		// 1. If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.out.println("launching new RMISecurityManager");
			System.setSecurityManager(new RMISecurityManager());
		}
	}
}
