/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_tcpclient;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.*;
import java.net.*;
/**
 *
 * @author plumi
 */
public class TCPClientGUI extends JFrame implements ActionListener{
    static JTextArea txtArea;
    static JButton btnsend;
    static JTextField txtfield;
    static String sentence;
    static String modifierSentence;
    static Socket clientSocket;
    static DataOutputStream outToServer ;
    static DataInputStream inFromServer;
    
    public TCPClientGUI() throws IOException{
        super("TCP Client");
        Container container = getContentPane();        
        txtArea = new JTextArea();
        txtfield = new JTextField(); 
        txtfield.setPreferredSize(new Dimension(300,30));
        btnsend = new JButton("Send");
        JPanel panel = new JPanel();
        
        container.add(txtArea,BorderLayout.CENTER);
        container.add(panel,BorderLayout.SOUTH);
        
        panel.add(txtfield);
        panel.add(btnsend);
        this.setSize(400, 400);
        this.setVisible(true);
     
        btnsend.addActionListener(this);


    }
    
    public void actionPerformed(ActionEvent e){
        try{
            modifierSentence = txtfield.getText();

            outToServer.writeUTF(modifierSentence);
            txtArea.append("Me : "+modifierSentence+"\n");
            txtfield.setText("");
            outToServer.flush();
            
        }catch(Exception ex){
            
        }
    }
    
    public static void main(String [] args) throws Exception{
        TCPClientGUI clientGUI = new TCPClientGUI();
        clientGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        try{
            clientSocket = new Socket("localhost",6789);
            
            inFromServer = new DataInputStream(clientSocket.getInputStream());
            outToServer = new DataOutputStream(clientSocket.getOutputStream());
            
            while(true){
                sentence = inFromServer.readUTF();
                txtArea.append("Server : "+sentence+"\n");
            }
            
        }catch(Exception e){
            
        }
        
        clientSocket.close();
        inFromServer.close();
        outToServer.close();
    }
}
