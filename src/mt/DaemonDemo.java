package mt;

class DaemonThread extends Thread {
	@Override
	public void run() // overriding run()
	{
		for (int i = 1; i <= 50; i++) {
			System.out.printf("Daemon -> %d\t", i);
		}
	} // end of run
} // end of childThread

public class DaemonDemo {
	public static void main(String args[]) throws InterruptedException  {
		System.out.println("In Main");  
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start(); // run thread
		// put main thread to sleep for 10 millis
		Thread.currentThread().sleep(10);
		System.out.println("End of main");
	} // end of main
}
