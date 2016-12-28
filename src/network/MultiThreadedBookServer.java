package network;
//  Server to handle multiple clients
import java.net.*;
import java.io.*;

public class MultiThreadedBookServer {
 public static void main(String args[]) throws Exception  {
    
    ServerSocket  ssocket;
    ssocket = new ServerSocket(3000,10);  
    System.out.println("Book server started and ready!");
    while(true) {
     Socket s = ssocket.accept();
     System.out.println("Accepted Client Request...");
     HandleClient obj = new HandleClient(s);
    }
 }
} // end of class

class HandleClient extends Thread {
   Socket s;
   public HandleClient(Socket s) {
       this.s = s; 
       start(); // start thread
   }
   public void run()  {
    String books[] = {"Java Complete Reference","Core Java Vol I & II", "Thinking in Java"};
    try  {
      // read string from client
      BufferedReader br = new BufferedReader(
              new InputStreamReader(s.getInputStream()));
      PrintWriter pw = new PrintWriter(
              s.getOutputStream(),true);
      int bookno;
      String title;

      while(true) {
        bookno= Integer.parseInt(br.readLine());
        if  (bookno == 0 ) break;
        if  (bookno-1 < books.length)
             title  =  books[bookno-1];
        else
             title = "";   // book not found

        // send title back to client
       pw.println(title);
      } // end of while
      System.out.println("Client Connection Closed");
    }
    catch(Exception ex) { 
        System.out.println(ex.getMessage()); 
    }
   } // end of run
} // end of class




     
