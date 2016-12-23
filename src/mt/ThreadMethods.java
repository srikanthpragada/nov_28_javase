package mt;
public class ThreadMethods {
 
    public static void main(String args[])   throws Exception 
    {
        System.out.println("waiting...");
        Thread.sleep(1000);
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
        System.out.println("End");
       
        
    }

    
}
