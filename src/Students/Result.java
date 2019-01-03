/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;


/**
 *
 * @author Prajwal
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form details
     */
    public Result() {
        initComponents();
        showDetails();
    }

    public void showDetails() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;

            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","1234");
            Statement stmt;

            stmt=con.createStatement();
            stmt.executeUpdate("use resultsystem;");
            String sql;
            sql="select * from cid where flag=1;";

           ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            String id=rs.getString("id");

            sql="select * from result where id="+id+";";

            rs=stmt.executeQuery(sql);
            rs.next();
            String name=rs.getString("name");
            String mother=rs.getString("mother");
            String father=rs.getString("father");
            String gender =rs.getString("gender");
            String cat=rs.getString("category");
            String state=rs.getString("state");
            String dob=rs.getString("dob");
            String math=rs.getString("maths");
            String phy=rs.getString("phy");
            String chem=rs.getString("chem");
            String total=rs.getString("total");
            
            rs.close();
    
            con.close();
            stmt.close();
            Result.setText("Student id: "+id+"\nName: "+name+"\nMother's Name: "+mother+"\nFather's Name: "
             +father+"\nDOB: "+dob+"\nGender: "
             +gender+"\nCategory: "+cat);
        }
        catch(Exception e)
        {

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTextArea();
        showButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sttable = new javax.swing.JTable();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 5, true), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Banner", 3, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        Result.setEditable(false);
        Result.setColumns(20);
        Result.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        Result.setRows(5);
        jScrollPane1.setViewportView(Result);

        showButton.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        showButton.setText("SHOW RESULT");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        sttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORY"
            }
        ));
        jScrollPane2.setViewportView(sttable);

        logOutButton.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        logOutButton.setText("LOG OUT");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(showButton)
                .addGap(81, 81, 81)
                .addComponent(logOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showButton)
                    .addComponent(logOutButton))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        // TODO add your handling code here:
        
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con;

            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/mysql","root","1234");
            Statement stmt;

            stmt=con.createStatement();
            stmt.executeUpdate("use resultsystem;");
            String sql;
            sql="select * from cid where flag=1;";

           ResultSet rs=stmt.executeQuery(sql);
            rs.next();
            String id=rs.getString("id");

            sql="select * from result where id="+id+";";

            rs=stmt.executeQuery(sql);
            rs.next();
            String name=rs.getString("name");
            String mother=rs.getString("mother");
            String father=rs.getString("father");
            String gender =rs.getString("gender");
            String cat=rs.getString("category");
            String state=rs.getString("state");
            String dob=rs.getString("dob");
            String math=rs.getString("maths");
            String phy=rs.getString("phy");
            String chem=rs.getString("chem");
            String total=rs.getString("total");



            int rnk=0,catrnk=0;
            sql="select * from result order by total DESC, maths DESC, phy DESC, chem DESC, id ASC;";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                String catg=rs.getString("category");
                String ids=rs.getString("id");
                rnk++;
                if(catg.equals(cat)){
                    catrnk++;
                }
                if(ids.equals(id)){
                    break;
                }
            }
            rs.close();

            con.close();
            stmt.close();
            if(phy.equals("0")){
                 Result.setText("Student id: "+id+"\nName: "+name+"\nMother's Name: "+mother+"\nFather's Name: "
                     +father+"\nDOB: "+dob+"\nGender: "
                     +gender+"\nCategory: "+cat+"\n\nResult Not Published ");
            }
            else if(cat.equals("General")){

               Result.setText("Student id: "+id+"\nName: "+name+"\nMother's Name: "+mother+"\nFather's Name: "
                     +father+"\nDOB: "+dob+"\nGender: "
                     +gender+"\nCategory: "+cat+"\n\nMaths: "+math+"\nPhysics: "+phy+"\nChemistry: "+chem+"\nTotal: "
                       +total+"\n\nRank: "+rnk);
           }
           else {
               Result.setText("Student id: "+id+"\nName: "+name+"\nMother's Name: "+mother+"\nFather's Name: "
                     +father+"\nDOB: "+dob+"\nGender: "
                     +gender+"\nCategory: "+cat+"\n\nMaths: "+math+"\nPhysics: "+phy+"\nChemistry: "+chem+"\nTotal: "+total+"\n\nRank: "+rnk+"\nCategory Rank: "+catrnk);
           }



        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_showButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For Result see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Result;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton showButton;
    private javax.swing.JTable sttable;
    // End of variables declaration//GEN-END:variables
}
