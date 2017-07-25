/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import package1.calculator;

/**
 *
 * @author Shoojan
 */
public class LoginWindowAdvanced extends JFrame{
    JTextField txtname;
    JPasswordField txtPassword;
    JLabel output;
    Font f = new Font("Dolphin",Font.BOLD,15);

    public LoginWindowAdvanced(){
        super("Advanced Login Window");
        FlowLayout flayout = new FlowLayout();
        GridLayout glayout = new GridLayout(2,0);
        
        Container container = getContentPane();
        container.setLayout(glayout);
        JPanel panel = new JPanel();
        panel.setLayout(flayout);
        
        container.add(panel);
        
        JLabel lblUser = new JLabel("User Name");
        lblUser.setFont(f);
        txtname = new JTextField("",10);
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(f);
        txtPassword = new JPasswordField("",10);
        JButton submitbtn = new JButton("Login");
        submitbtn.setFont(f);
        submitbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent args){
                if(txtname.getText().equals("s") && txtPassword.getText().equals("ss")){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    //output.setText("Username: " + txtname.getText() + " and Password : "+txtPassword.getText());
                    new calculator();
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Input, please try again.");
                }
            }
        });
        
        panel.add(lblUser);
        panel.add(txtname);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(submitbtn);
        
        output = new JLabel();
        container.add(output);
        
        this.setSize(250, 200);
        this.setVisible(true);
    }
    
    
    
    
    public static void main(String [] args){
        LoginWindowAdvanced LWindow = new LoginWindowAdvanced();
        LWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
