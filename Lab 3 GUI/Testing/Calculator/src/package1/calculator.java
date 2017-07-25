/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shoojan
 */
public class calculator extends JFrame implements ActionListener{
    String buttonname[] = { "CE","C","<-","%",
                            "7","8","9","/",
                            "4","5","6","*",
                            "1","2","3","-",
                            "0",".","+","="
                            };
    JTextArea input;
    JButton b[] = new JButton[20];
    double temp[] = new double[50];
    boolean flag[] = new boolean[5];
    
    
    
    public calculator(){
        super("Calculator");
        BorderLayout blay = new BorderLayout();
        Container pane = getContentPane();
        pane.setLayout(blay);

        Font f = new Font("Dolphin",Font.BOLD,25);

        input = new JTextArea();
        input.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        input.setPreferredSize(new Dimension(200,50));
        input.setFont(f);
        
        pane.add(input,BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        GridLayout glay = new GridLayout(5,4,5,5);
        panel.setLayout(glay);
        pane.add(panel,BorderLayout.CENTER);
        
        
        for(int i=0;i<20;i++){
            b[i] = new JButton(buttonname[i]);
            b[i].setFont(f);
            //b[i].setName(String.valueOf(i));
            panel.add(b[i]);
//            if(i==19){
//                b[19].addActionListener(new ActionListener(){
//                @Override
//                public void actionPerformed(ActionEvent Args){
//                    input.setText("Hello");
//                }
//            });
//            }
            b[i].addActionListener(this);
        }

        this.setSize(300,400);
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent args){
        //input.setText(String.valueOf(args));
        
        if(args.getSource()==b[4])
            input.append("7");
        if(args.getSource()==b[5])
            input.append("8");
        if(args.getSource()==b[6])
            input.append("9");
        if(args.getSource()==b[8])
            input.append("4");
        if(args.getSource()==b[9])
            input.append("5");
        if(args.getSource()==b[10])
            input.append("6");
        if(args.getSource()==b[12])
            input.append("1");
        if(args.getSource()==b[13])
            input.append("2");
        if(args.getSource()==b[14])
            input.append("3");
        if(args.getSource()==b[16])
            input.append("0");
        if(args.getSource()==b[17])
            input.append(".");
        
        if(args.getSource() == b[7]){
            temp[0] = Double.parseDouble(input.getText());
            flag[1] = true;
            input.setText("");
        }
        if(args.getSource() == b[11]){
            temp[0] = Double.parseDouble(input.getText());
            flag[2] = true;
            input.setText("");
        }
        if(args.getSource() == b[15]){
            temp[0] = Double.parseDouble(input.getText());
            flag[3] = true;
            input.setText("");
        }
        if(args.getSource() == b[18]){
            temp[0] = Double.parseDouble(input.getText());
            flag[4] = true;
            input.setText("");
        }
        
        if(args.getSource() == b[0]){
            
        }
        
        if(args.getSource() == b[1]){
            for(int i=0;i<5;i++)
                flag[i] = false;
            input.setText("");
        }
        
        if(args.getSource() == b[2]){
        }
        
        if(args.getSource() == b[19]){
            getResult();
        }
        
    }
    
    public void getResult(){
        double result = 0;
        temp[1] = Double.parseDouble(input.getText());
        if(flag[0] == true){
            result = temp[0]%temp[1];
        }else if(flag[1] == true){
            result = temp[0]/temp[1];
        }else if(flag[2] == true){
            result = temp[0]*temp[1];
        }else if(flag[3] == true){
            result = temp[0]-temp[1];
        }else if(flag[4] == true){
            result = temp[0]+temp[1];
        }
        input.setText(String.valueOf(result));
    }
    
    public static void main(String [] args){
        calculator cal = new calculator();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
