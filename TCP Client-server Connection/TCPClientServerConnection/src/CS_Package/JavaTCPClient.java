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
public class JavaTCPClient {
    public static void main(String [] args) throws Exception{
		String sentence;
		String modifierSentence;

		//Send message to server. String will be converted to bytes
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

		Socket clientSocket = new Socket("hostname", 6789); //127.0.0.1 for localhost

		//To send to server
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

		//Receive message from server
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		sentence = inFromUser.readLine();

		//Send the sentence to server
		outToServer.writeBytes(sentence + '\n');

		modifierSentence = inFromServer.readLine();

		System.out.println("From Server: " + modifierSentence + "\n");

		inFromServer.close();
		inFromUser.close();
		outToServer.close();
		clientSocket.close();

	}
}
