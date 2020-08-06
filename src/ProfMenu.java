
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class ProfMenu extends javax.swing.JFrame {

    public ProfMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        View = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AddQues = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View.setText("View All Record");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 40));

        Start.setText("StartPage");
        Start.setPreferredSize(new java.awt.Dimension(400, 300));
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 40));

        jLabel1.setText("To view the scores of the students who attended the quiz");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        AddQues.setText("Add Question");
        AddQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuesActionPerformed(evt);
            }
        });
        getContentPane().add(AddQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        JFrame f;
        JTable j ;
        String data[][]=new String[20][20];
        int i=0;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            Stat=conn.createStatement();
            rs = Stat.executeQuery("select * from onlineexam.studentlogin");
            while(rs.next()){
                if( rs.getInt("score") != -1 ){
                    data[i][0]= rs.getString("username");
                    String score = String.valueOf( rs.getInt("score"));
                    data[i][1]= score;
                    i++;
                }
            }
            f = new JFrame(); 
            f.setTitle("View Perfomance"); 
            String[] columnNames = { "Name" ,"score"}; 
            j = new JTable(data, columnNames); 
            j.setBounds(30, 40, 200, 300); 
            JScrollPane sp = new JScrollPane(j); 
            f.add(sp);
            f.setSize(500, 200); 
            f.setVisible(true); 
        }
        catch(SQLException | HeadlessException e){
            System.out.println("Error"+e);
        }    
        finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        this.dispose();
        new StartPage().setVisible(true);
    }//GEN-LAST:event_StartActionPerformed

    private void AddQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQuesActionPerformed
        this.dispose();
        new AddQues().setVisible(true);
    }//GEN-LAST:event_AddQuesActionPerformed

   
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
            java.util.logging.Logger.getLogger(ProfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddQues;
    private javax.swing.JButton Start;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
