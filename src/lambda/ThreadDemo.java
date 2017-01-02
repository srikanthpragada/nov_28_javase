package lambda;

class ThreadCode implements Runnable
{
	public void run() {
		System.out.println("I am in thread!");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// Normal class  
		Thread t = new Thread( new ThreadCode());
		t.start();
		
		//Anonymous inner class 
		Thread t2 = new Thread
				(
				  new Runnable() {
					  public void run() {
						  System.out.println("I am in thread created by inner class");
					  }
				  }
				);
		t2.start();
		
		// Lambda expression 
		Thread t3 = new Thread( () -> System.out.println("In thread created by Lambda"));
		t3.start();
		
		// Lambda block
		Thread t4 = new Thread( 
				      () -> {
			            for(int  i = 1; i <=10; i ++)
			            	System.out.println(i);
		              }
				);
		t4.start();
		
		// Method reference 
		Thread t5 = new Thread(ThreadDemo::print); 
	    t5.start();
	}
	
	public static void print() {
		for(int  i = 1; i <=10; i ++)
        	System.out.println(i);
	}

}
