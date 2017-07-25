/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS_Package;
import java.io.*;
import java.net.*;
/**
 *
 * @author plumi
 */
public class JavaTCPServer {
    public static void main(String [] args) throws Exception{
		String sentence;
		String modifierSentence;

		//Send message to server. String will be converted to bytes
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

		//Just for establishing connection. 
		ServerSocket serverSocket = new ServerSocket(6789); //Should be same in both server and client

		//For communication we use normal Socket... Always use Socket for communication...
		Socket sock = serverSocket.accept();

		//To receive from Client which comes through socket
		InputStream iStream = sock.getInputStream();
		//To sent to Client
		DataInputStream dStream = new DataInputStream(iStream);

		System.out.println("Server is ready!");

		sentence = dStream.readLine();

		System.out.println("From Client: " + sentence + "\n");

		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(System.in));


		modifierSentence = inFromServer.readLine();

		DataOutputStream outToClient = new DataOutputStream(System.in);

		outToClient.writeBytes(modifierSentence + "\n");
	}
}
