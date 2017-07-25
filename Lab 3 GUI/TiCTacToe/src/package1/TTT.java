/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Shoojan
 */
public class TTT extends JFrame implements ActionListener{
    Container container;
    JMenuBar menuBar;
    JMenu gameMenu;
    JMenuItem vsC, vsH, reset,close;
    JButton vsCom, vsHum;
    Font fnt = new Font("Dolphin",Font.BOLD,25);        
    JPanel welcomePanel,gamePanel,playerPanel;
    JButton [] grids = new JButton[9];
    JLabel l1,l2,l3,l4;
    Icon icPlayer1,icPlayer2;
    Icon icon[] = new Icon[3];
    JButton p1,p2;
    
    Boolean playerState=false;
    int solutions[][] = {
                            {10,1,2,3,11},{10,1,4,7,11},{10,1,5,9,11},{10,2,5,8,11},
                            {10,3,5,7,11},{10,3,6,9,11},{10,4,5,6,11},{10,7,8,9,11}
                        };
   
    
    public TTT(){
        super("My TicTacToe");
        
        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);
        
        this.vsC = new JMenuItem("Human Vs Computer");        
        this.vsH = new JMenuItem("Human Vs Human");
        this.reset = new JMenuItem("Reset Game"); 
        gameMenu.addSeparator();
        this.close = new JMenuItem("Exit Game (Alt+f4)");
        
        vsC.addActionListener(this);
        vsH.addActionListener(this);
        reset.addActionListener(this);
        close.addActionListener(this);
        
        gameMenu.add(vsC);
        gameMenu.add(vsH);
        gameMenu.add(reset);
        gameMenu.add(close);
        
        container = getContentPane();
        welcomePanel = new JPanel();
        GridLayout glay = new GridLayout(4,0);
        welcomePanel.setLayout(glay);

        JLabel line1 = new JLabel("Welcome");
        JLabel line2 = new JLabel("To");
        JLabel line3 = new JLabel("Tic Tac Toe");
        line1.setFont(fnt);
        line2.setFont(fnt);
        line3.setFont(fnt);
        line1.setHorizontalAlignment(SwingConstants.CENTER);
        line2.setHorizontalAlignment(SwingConstants.CENTER);
        line3.setHorizontalAlignment(SwingConstants.CENTER);
        welcomePanel.add(line1);
        welcomePanel.add(line2);
        welcomePanel.add(line3);
        JPanel gamemode = new JPanel();
        welcomePanel.add(gamemode);
        
        vsCom= new JButton("Human Vs Computer");
        vsHum = new JButton("Human Vs Human");
        gamemode.add(vsCom,BorderLayout.EAST);
        gamemode.add(vsHum,BorderLayout.WEST);
        vsCom.addActionListener(this);
        vsHum.addActionListener(this);
        
        container.add(welcomePanel,BorderLayout.CENTER);
        l1 = new JLabel("****************************************************************************");
        l2 = new JLabel("*********");
        l3 = new JLabel("*********");
        l4 = new JLabel("****************************************************************************");
        container.add(l1,BorderLayout.NORTH);
        container.add(l2,BorderLayout.EAST);
        container.add(l3,BorderLayout.WEST);
        container.add(l4,BorderLayout.SOUTH);
        
        icPlayer1 = new ImageIcon("D:\\7th Sem\\Java Lab\\Icons\\By Arun Designer\\o.png");
        icPlayer2 = new ImageIcon("D:\\7th Sem\\Java Lab\\Icons\\By Arun Designer\\X.png");
        
        this.setSize(400,400);
        this.setVisible(true);
        
    }    
    
    public void loadGame(){
        gamePanel = new JPanel();
        container.remove(l1);
        l1 = new JLabel("***********************    Human Vs Computer    *************************");
        container.add(l1,BorderLayout.NORTH);
        GridLayout gameglay= new GridLayout(3,3,5,5);
        gamePanel.setLayout(gameglay);
        for(int i=0;i<9;i++){
            grids[i] = new JButton();
            grids[i].addActionListener(this);
            gamePanel.add(grids[i]);
        }
        container.add(gamePanel);
    }
    
    public void chooseplayer(){
        playerPanel = new JPanel();
        p1 = new JButton();
        p2 = new JButton();
        p1.setIcon(icPlayer1);
        p2.setIcon(icPlayer2);
        p1.addActionListener(this);
        p2.addActionListener(this);
        playerPanel.add(p1,BorderLayout.EAST);
        playerPanel.add(p2,BorderLayout.WEST);
        container.add(playerPanel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.close){
            this.setVisible(false);
            this.dispose();
        }else if(e.getSource() == this.vsH || e.getSource() == this.vsHum){
            welcomePanel.setVisible(false);
            chooseplayer();
        }else if(e.getSource() == this.vsC || e.getSource() == this.vsCom){
            JOptionPane.showMessageDialog(null, "Computer is busy currently.");
        }
        else if(e.getSource() == this.reset){
            for(int i =0;i<9;i++){
                grids[i].setIcon(null);
            }
        }
        
        for(int i =0;i<9;i++){
            if(e.getSource()==grids[i]){
                
                if(playerState == false){
                    grids[i].setIcon(icPlayer1);
                    container.remove(l4);
                    l4 = new JLabel("***************************    Player 1's Turn    *************************");
                    container.add(l4,BorderLayout.SOUTH);
                    playerState = true;  
                }
                else{
                    grids[i].setIcon(icPlayer2);
                    container.remove(l4);
                    l4 = new JLabel("***************************    Player 2's Turn    *************************");
                    container.add(l4,BorderLayout.SOUTH);
                    playerState = false;
                }
                checkResult();
            }
        }
        
        if(e.getSource() == p1){
            playerState = false;
            playerPanel.setVisible(false);
            loadGame();
        }else if(e.getSource() == p2){
            playerState = true;
            playerPanel.setVisible(false);
            loadGame();
        }
    }
    
    public void checkResult(){
        for(int i = 0;i<=7;i++){
            for(int j = 0; j<3;j++)
                icon[j] = grids[solutions[i][j+1]-1].getIcon();
            
            if(icon[0] == icon[1] && icon[1]== icon[2] && icon[0]==icon[2] && icon[0] != null){
                if(icon[0] == icPlayer1){
                    JOptionPane.showMessageDialog(null, "Player 1 Won.");
                    break;
                }
                else if(icon[0] == icPlayer2){
                    JOptionPane.showMessageDialog(null, "Player 2 Won.");
                    break;
                }
            }
        }
    }
    
    public static void main(String [] args){
        TTT ttt = new TTT();
        ttt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

