// A Simple Server Socket that sends current date and time to client

package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

    public static void main(String args[])
            throws Exception {
        ServerSocket ss = new ServerSocket(2000, 10);
        System.out.println("Server has started and is ready to accept client requests...");
        while (true) {
            Socket cs = ss.accept();
            // convert output stream of client to PrintWriter with autoflush
            PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
            pw.println(new Date().toString()); // write date and time to client
        } // end of while
    }// end of main
} // end of class

