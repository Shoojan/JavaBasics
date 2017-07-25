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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author plumi
 */
public class UDPServer {
    DatagramSocket socket;
    
    
    UDPServer(){
        try {
            socket = new DatagramSocket(6789);
            byte[] inbyte = new byte[1024];
            
            while(true){
                DatagramPacket inPacket = new DatagramPacket(inbyte, inbyte.length);
                socket.receive(inPacket);
                
                String recievedData = new String(inPacket.getData());
                System.out.println("Client Says : "+recievedData);
                
                InetAddress ia = inPacket.getAddress();
                int port = inPacket.getPort();                
                String reply = "Thank you for your message.";
                
                byte[] outbyte = reply.getBytes();
                
                DatagramPacket outPacket = new DatagramPacket(outbyte, outbyte.length , ia,port);
                socket.send(outPacket);
                
            }
            
        } catch (SocketException ex) {
            System.out.println("SocketException : "+ex.toString());
        } catch (IOException ex) {
            Logger.getLogger(UDPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void main(String[] args) {
        UDPServer server = new UDPServer();
    }
}
