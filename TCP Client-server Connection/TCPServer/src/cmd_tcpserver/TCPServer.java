/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd_tcpserver;
import java.io.*;
import java.net.*;
/**
 *
 * @author plumi
 */
public class TCPServer {
    public static void main(String [] args) throws Exception{
	ServerSocket outFirstSocket = new ServerSocket(6789);
        while(true){
            Socket connectionsocket = outFirstSocket.accept();
            BufferedReader messagesfromClient = new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
            String clientSentence = messagesfromClient.readLine();
            System.out.println("Recieved : "+clientSentence);
        }
    }
}
