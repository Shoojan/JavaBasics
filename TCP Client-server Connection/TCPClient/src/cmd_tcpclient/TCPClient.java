/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd_tcpclient;
import java.io.*;
import java.net.*;
/**
 *
 * @author plumi
 */
public class TCPClient {
    public static void main(String [] args) throws Exception{ 	
		Socket clientsocket = new Socket("localhost",6789);
                DataOutputStream outToServer = new DataOutputStream(clientsocket.getOutputStream());
                BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
                String sentence = inFromUser.readLine();
                outToServer.writeBytes(sentence + "\n");
                clientsocket.close();
	}
}
