import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shoojan
 */
public class BorderlayoutDemo extends JFrame{
    String options[] = {"Male","Female"};
    
    public BorderlayoutDemo(){
        super("Border Layout Demo"); //title of frame
        BorderLayout layout = new BorderLayout();
        Container pane = getContentPane(); //makes container in the frame
        pane.setLayout(layout);
        
        JTextField textNorth = new JTextField();
        JButton buttoncenter = new JButton("Center Button ma click gara");
        JComboBox comboSouth = new JComboBox(options);

        pane.add(buttoncenter,BorderLayout.CENTER);
        pane.add(textNorth, BorderLayout.NORTH);
        pane.add(comboSouth,BorderLayout.SOUTH);
        
        this.setSize(400,400);   //set size of the windows to be displayed
        this.setVisible(true);  //visibility should be set
    }
    
    public static void main(String [] args){
        BorderlayoutDemo demo = new BorderlayoutDemo();        
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
