/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author plumi
 */
public class dbQueries {
    
    public dbQueries(){
        
    }
    
    public void addStdInfo(ArrayList data){
        dbConnect dbcon = new dbConnect();
        Connection con = dbcon.ConnectDB();
        
        PreparedStatement pstmt;
        pstmt = null;
        try {
            String query = "INSERT INTO student(first_name,last_name,address,phone,gender,email,dob) VALUES(?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            for(int i=0;i<6;i++){
                pstmt.setString(i+1, data.get(i).toString()); //database ko array index 1 baatai suru hunxa
            }
            
            //pstmt.setDouble(2,Double.parseDouble(data.get(2).toString()));
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date myDate = format.parse(data.get(6).toString());
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            pstmt.setDate(7, sqlDate);
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Execution Error : "+ex.toString());
        /*Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO student(first_name,last_name,address,phone,gender,email)"
                              +"VALUES('fname','lname','adr',4312119,'gen','email')");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Execution Error : "+ex.toString());
        }*/
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null,"Parsing Error : "+ex.toString());
        }
    }
    
    public ResultSet viewStdInfo(){
        dbConnect dbcon = new dbConnect();
        Connection con = dbcon.ConnectDB();
        ResultSet rs = null;
        Statement stmt = null;
        
        String query = "SELECT * FROM student Order by id";
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); //for two way communication
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Statement Error : "+ex.toString());
        }
        return rs;
    }
    
    public ResultSet VieweditStdInfo(int id){
        dbConnect dbcon = new dbConnect();
        Connection con = dbcon.ConnectDB();
        ResultSet rs = null;
        Statement stmt = null;
        
        String query = "SELECT * FROM student WHERE id="+id;
        try {
            stmt = con.createStatement(); 
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Statement Error : "+ex.toString());
        }
        return rs;
    }

    public void updateStdInfo(ArrayList data, int id){
        dbConnect dbcon = new dbConnect();
        Connection con = dbcon.ConnectDB();

        Statement stmt = null;
            
            String fname = data.get(0).toString();
            String lname = data.get(1).toString();
            String address = data.get(2).toString();
            String phone = data.get(3).toString();
            String gender = data.get(4).toString();
            String email = data.get(5).toString();
            String dob = data.get(6).toString();
         
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE student SET "
                    + "first_name='"+fname+"',"
                            + "last_name='"+lname+"',"
                                    + "address='"+address+"',"
                                            + "phone='"+phone+"',"
                                                    + "gender='"+gender+"',"
                                                            + "email='"+email+"',"
                                                                    + "dob='"+dob+"' WHERE id="+id);
            JOptionPane.showMessageDialog(null,"Data Updated Successfully");    

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Execution Error : "+ex.toString());
        }
    }
}
