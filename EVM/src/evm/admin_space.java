/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author aryan
 */
public class admin_space extends javax.swing.JFrame {

    /**
     * Creates new form admin_space
     */
    public admin_space() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        v1 = new javax.swing.JLabel();
        v2 = new javax.swing.JLabel();
        v3 = new javax.swing.JLabel();
        v4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator");

        result.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        result.setText("Results");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Headboy");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Headgirl");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sports Captain");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Arts Captain");

        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n2.setText("*****");

        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n1.setText("*****");

        n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n3.setText("*****");

        n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        n4.setText("*****");

        v1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v1.setText("*****");

        v2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v2.setText("*****");

        v3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v3.setText("*****");

        v4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        v4.setText("*****");

        reset.setText("Reset Database");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Votes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(reset)
                        .addGap(77, 77, 77)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(result)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(n3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v4)
                    .addComponent(v3)
                    .addComponent(v2)
                    .addComponent(v1))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(v1)
                        .addGap(25, 25, 25)
                        .addComponent(v2)
                        .addGap(18, 18, 18)
                        .addComponent(v3)
                        .addGap(18, 18, 18)
                        .addComponent(v4)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(logout)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(n2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(n3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(n4))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
  try{    Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","1234");
        Statement st=cn.createStatement();
        ResultSet rs1,rs2,rs3,rs4;
        String q1,q2,q3,q4;
        System.out.println("okay1");
        q1="select name,vote  from headboy where vote in(select max(vote) from headboy);";
        q2="select name,vote  from headgirl where vote in(select max(vote) from headgirl);";
        q3="select name,vote  from sportscaptain where vote in(select max(vote) from sportscaptain);";
        q4="select name,vote  from artscaptain where vote in(select max(vote) from artscaptain);";
        rs1=st.executeQuery(q1);
        rs1.next();
        n1.setText(rs1.getString(1));
        v1.setText(""+rs1.getInt(2));
        
         rs1=st.executeQuery(q2);
        rs1.next();
        n2.setText(rs1.getString(1));
        v2.setText(""+rs1.getInt(2));
        
         rs1=st.executeQuery(q3);
        rs1.next();
        n3.setText(rs1.getString(1));
        v3.setText(""+rs1.getInt(2));
        
         rs1=st.executeQuery(q4);
        rs1.next();
        n4.setText(rs1.getString(1));
        v4.setText(""+rs1.getInt(2));
        
        
       /* rs1=st.executeQuery(q2);
        rs2.next();
        rs3=st.executeQuery(q3);
        rs3.next();
        rs4=st.executeQuery(q4);
        rs4.next();
        System.out.println("okay3");
        //n1.setText(rs1.getString(1));
        System.out.println("okay4");
        int p=rs1.getInt(2);
        System.out.println(""+p);
       // System.out.println(rs1.getInt(0));
        v1.setText(""+rs1.getInt(2));
        System.out.println("ok5");
       // n2.setText(rs2.getString(1));
        v2.setText(""+rs2.getInt(2));
       // n3.setText(rs3.getString(1));
        v3.setText(""+rs3.getInt(2));
        //n4.setText(rs4.getString(1));
        v4.setText(""+rs4.getInt(2));*/
        cn.close();
        st.close();
        
        
        
  }catch(Exception e){
      System.out.println(""+e);
  }
    }//GEN-LAST:event_resultActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/evm","root","1234");
        Statement st=cn.createStatement();
       String q1,q2,q3;
       q1="UPDATE headboy SET vote=0;";
       st.executeUpdate(q1);
       q1="UPDATE headgirl SET vote=0;";
       st.executeUpdate(q1);
       q1="UPDATE sportscaptain SET vote=0;";
       st.executeUpdate(q1);
       q1="UPDATE artscaptain SET vote=0;";
       st.executeUpdate(q1);
       
       q2="drop table if exists logged;";
       st.executeUpdate(q2);
       q3="create table logged(reg int(8));";
       st.executeUpdate(q3);
       cn.close();
       st.close();
}
catch(Exception e){
   // System.out.println(""+e);
}
    }//GEN-LAST:event_resetActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login log=new login();
        log.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_space().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logout;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JButton reset;
    private javax.swing.JButton result;
    private javax.swing.JLabel v1;
    private javax.swing.JLabel v2;
    private javax.swing.JLabel v3;
    private javax.swing.JLabel v4;
    // End of variables declaration//GEN-END:variables
}
