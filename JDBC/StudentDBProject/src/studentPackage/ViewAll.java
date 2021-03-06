/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentPackage;

import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author plumi
 */
public class ViewAll extends javax.swing.JFrame {

    ResultSet rs;
    
    String id,fname,lname,address,phone,gender,email,dob;
    /**
     * Creates new form ViewAll
     */
    public ViewAll() {
        initComponents();
        
        createResultSet();
        
        displayInfo();
    }
    
    public void createResultSet(){
        dbOperations.dbQueries dbQ= new dbOperations.dbQueries();
        rs = dbQ.viewStdInfo();
    }
    
    public void displayInfo(){
        try {
            while(rs.next()){
                id = rs.getString("id");
                fname = rs.getString("first_name");
                lname = rs.getString("last_name");
                address = rs.getString("address");
                phone = rs.getString("phone");
                gender = rs.getString("gender");
                email = rs.getString("email");
                dob = rs.getString("dob");
                
                tableModel.addRow(new Object[] {id,fname,lname,address,phone,gender,email,dob});
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewData = new javax.swing.JTable();

        tblViewData = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };

        tableModel.setColumnIdentifiers(colNames);
        tblViewData.setModel(tableModel);

        tblViewData.setRowHeight(30);
        /*
        tblViewData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "First Name", "Last Name", "Address", "Phone", "Gender", "Email", "DOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        */
        tblViewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblViewData);
        if (tblViewData.getColumnModel().getColumnCount() > 0) {
            tblViewData.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblViewData.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblViewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewDataMouseClicked
        // TODO add your handling code here:
        javax.swing.JTable table = (javax.swing.JTable)evt.getSource();
        Point p = evt.getPoint();
        int row = table.rowAtPoint(p);
        System.out.println(row);
        if(evt.getClickCount() == 2){
            int id = Integer.parseInt(tableModel.getValueAt(row, 0).toString());

//            ArrayList list = new ArrayList();
//            for(int i = 1;i<=7;i++)
//                list.add(tableModel.getValueAt(row, i));
//            list.add(tableModel.getValueAt(row, 0));
//            
            MainPage mp = new MainPage();
            mp.getAllData(id);
            
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_tblViewDataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewData;
    // End of variables declaration//GEN-END:variables
    public String [] colNames = {
        "Id", "First Name", "Last Name", "Address", "Phone", "Gender", "Email", "DOB"
    };
    
    DefaultTableModel tableModel = new DefaultTableModel();
}
