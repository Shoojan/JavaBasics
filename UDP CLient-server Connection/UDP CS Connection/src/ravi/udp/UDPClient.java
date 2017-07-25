/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ravi.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author plumi
 */
public class UDPClient {
    
    DatagramSocket socket = null;
    InetAddress ia;
    
    public UDPClient(){
        try {
            socket = new DatagramSocket();
            ia = InetAddress.getByName("localhost");
            
            byte[] msgout;
            byte[] msgin = new byte[1024];
            
            System.out.println("Client : ");
            Scanner in = new Scanner(System.in);
            String data = in.nextLine();
            
            msgout = data.getBytes();
            
            DatagramPacket outPacket = new DatagramPacket(msgout, msgout.length , ia ,6789);
            socket.send(outPacket);
            
            DatagramPacket inPacket = new DatagramPacket(msgin, msgin.length);
            socket.receive(inPacket);
            
            String receivedData =new String(inPacket.getData());
            System.out.println("Server says : "+receivedData);
            
            socket.close();
            
        } catch (SocketException ex) {
            System.out.println("Socket Exception : "+ex.toString());
        } catch (UnknownHostException ex) {
            System.out.println("UnknownHost Exception : "+ex.toString());
        } catch (IOException ex) {
            System.out.println("IO Exception : "+ex.toString());
        }
    }
    
    public static void main(String[] args) {
        UDPClient client = new UDPClient();
    }
}
