package mt;
// Multithreading using subclass of Thread class 
class ChildThread extends Thread {
	@Override
	public void run() // overriding run()
	{
		for (int i = 1; i <= 50; i++) {
			System.out.printf("Child -> %d\t", i);
		}
	} // end of run
} // end of childThread

public class MainThread {
	public static void main(String args[]) throws InterruptedException  {
		System.out.println("In Main");  
		ChildThread ct1 = new ChildThread();
		ct1.start(); // run thread

		System.out.println("In Main again");

		for (int i = 1; i <= 50; i++) {
			System.out.printf("Main -> %d\t", i);
		} // end of for
		
		System.out.println("Waiting for child to terminate!");
		ct1.join();

		System.out.println("End of main");
	} // end of main
}
