/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_tcpserver;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author plumi
 */
public class TCPServerGUI extends JFrame implements ActionListener{
    static JTextArea txtArea;
    static JButton btnsend;
    static JTextField txtfield;
    static String sentence="";
    static String modifierSentence="";
    static Socket socket;
    static ServerSocket ss;
    static DataInputStream din;
    static DataOutputStream dout;
    
    
    public TCPServerGUI(){
        super("TCP Server");
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
        
        try{
            ss = new ServerSocket(6789);
            socket = ss.accept();
            
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());
            
            while(true){
                sentence = din.readUTF();
                txtArea.append("Client : "+sentence+"\n");
                
            }
            
            
            
        }catch(Exception ee){
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){

        try {
            modifierSentence = txtfield.getText();
            dout.writeUTF(modifierSentence);
            txtArea.append("Me : "+ modifierSentence+"\n");
            txtfield.setText("");
            dout.flush();
        } catch (IOException ex) {
            Logger.getLogger(TCPServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
	
    }
    
    public static void main(String [] args){
        TCPServerGUI clientGUI = new TCPServerGUI();
        clientGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try{
            socket.close();
            din.close();
            dout.close();
        }catch(Exception ee){
            
        }
    }
}
