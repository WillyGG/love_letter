/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.net.*;
import java.io.*;

/**
 *
 * @author Zerenity
 */
public class KKMultiServer {
    public static void main(String[] args) throws IOException {
        int portNumber = 8000;
        boolean listening = true;
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
            while (listening) {
	            new KKMultiServerThread(serverSocket.accept()).start();
	        }
	    } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
}
