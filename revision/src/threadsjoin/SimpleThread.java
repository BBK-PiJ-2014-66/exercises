package threadsjoin;

/**
 * Oliver's work through of Keith's threads join example from
 * https://bitbucket.org/keithmannock/pij14-15  
 * PiJ14-15/revision/threading/src/SimpleThread.java 
 *
 */
public class SimpleThread implements Runnable {
	private String name;

	public SimpleThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0 ; i<10; ++i) {
			System.out.println( name + " start loop #" + i);
			try {
				int sleepSecs = (int)(Math.random()*1000.);
				Thread.sleep(sleepSecs);
						
			} catch (InterruptedException ex) {
				System.out.println( name + " got exception: " + ex.getMessage());
			}
		}
		System.out.println( name + " completed");
	}

}
