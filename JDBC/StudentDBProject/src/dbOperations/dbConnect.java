/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author plumi
 */
public class dbConnect {
    String HOST;
    String PORT;
    String DBNAME;
    String USERNAME;
    String PASSWORD;
    Connection conn = null;
    
    public dbConnect(){
        this.HOST = "localhost";
        this.PORT = "5432";
        this.DBNAME = "JavaDB";
        this.USERNAME = "postgres";
        this.PASSWORD = "12345";
    }
    
    public Connection ConnectDB(){
        try {
            Class.forName("org.postgresql.Driver");
            String connectionString = "jdbc:postgresql://"+HOST+":"+PORT+"/"+this.DBNAME;
            conn = DriverManager.getConnection(connectionString,this.USERNAME,this.PASSWORD);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Driver error : "+ex.toString());
        } catch (SQLException ex) {
            //Logger.getLogger(dbConnect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Connection Error : "+ex.toString());
        }
//        if(conn != null)
//            JOptionPane.showMessageDialog(null,"Connection Successful");
        return this.conn;
    }
    
    
}
