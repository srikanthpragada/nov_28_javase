package mt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        
        ExecutorService pool = Executors.newFixedThreadPool(5);
        
        for ( int i = 1; i <= 10; i ++) {
            PrintJob pt  = new PrintJob("Thread " + i);
            pool.execute(pt);
        }
    }
}

class  PrintJob implements Runnable {
    private String name;
    public PrintJob(String name) {
        this.name = name;
    }
    public void run() {
        for ( int i = 1; i <= 10 ; i ++) {
            System.out.println( name + " : " +  i);
        }
    }
    
    
}