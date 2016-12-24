package mt;
class Data {
	synchronized public void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100);
			} catch (Exception ex) {
			}
		}
	}
} // end of data
class CThread extends Thread {
	Data obj;
	public CThread(Data obj, String name) {
		this.obj = obj;
		setName(name);
		start(); // run()
	}
	public void run() {
		obj.print();
	}
} // end of CThread
public class SyncTest {
	public static void main(String args[]) {
		CThread t1, t2;
		Data obj = new Data();
		t1 = new CThread(obj, "First");
		t2 = new CThread(obj, "Second");
	} // end of main
}
