package mt;

class ThreadCode implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Child --> " + i);
        }
    } // end of run
} // end of MyThread

public class RunnableThread {
    public static void main(String args[]) {
        ThreadCode tc = new ThreadCode();
        Thread t = new Thread(tc);
        t.start();  //  run() of  tc

        for (int i = 1; i <= 50; i++) {
            System.out.println("Main --> " + i);
        }
        System.out.println("Main is over");

    }
}
