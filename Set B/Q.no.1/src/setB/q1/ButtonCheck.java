/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setB.q1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author plumi
 */
public class ButtonCheck extends JFrame implements KeyListener{
    
    JTextField labeltxt;
    JTextField showkeypressed;
    
    public ButtonCheck(){
        super("Button Check");
        BorderLayout layout = new BorderLayout();
        Container pane = getContentPane(); //makes container in the frame
        pane.setLayout(layout);
        
        labeltxt = new JTextField();
        showkeypressed = new JTextField();
        labeltxt.setText("Please press key");
        showkeypressed.setText("");
        
        pane.add(labeltxt,BorderLayout.NORTH);
        labeltxt.addKeyListener(this);
        pane.add(showkeypressed,BorderLayout.SOUTH);
        
        showkeypressed.addKeyListener(this);
        
        this.setSize(300,300);
        this.setVisible(true);
    }
    
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        labeltxt.setText("KeyCode : "+String.valueOf(keyCode));
        switch( keyCode ) { 
            case KeyEvent.VK_UP:
                showkeypressed.setText("Up Pressed.");
                break;
            case KeyEvent.VK_DOWN:
                showkeypressed.setText("DOWN Pressed.");
                break;
            case KeyEvent.VK_LEFT:
                showkeypressed.setText("Left Pressed.");
                break;
            case KeyEvent.VK_RIGHT :
                showkeypressed.setText("Right Pressed.");
                break;
         }
    } 
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String [] args){
        ButtonCheck bc = new ButtonCheck();
    }
}
