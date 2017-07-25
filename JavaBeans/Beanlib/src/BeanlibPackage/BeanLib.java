/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanlibPackage;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author plumi
 */
public class BeanLib implements Serializable{
    
    public BeanLib(){
        System.out.println("Java Bean Activated.");
        
    }
    
    public void add(JTextField j1,JTextField j2, JTextField j3){
        Double t1 = Double.parseDouble(j1.getText());
        Double t2 = Double.parseDouble(j2.getText());
        Double t3 = t1+t2;
        j3.setText(t3.toString());
    }
    
    public void multiply(JTextField j1,JTextField j2, JTextField j3){
        Double t1 = Double.parseDouble(j1.getText());
        Double t2 = Double.parseDouble(j2.getText());
        Double t3 = t1*t2;
        j3.setText(t3.toString());
    }
    
}
