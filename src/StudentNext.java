
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import net.proteanit.sql.DbUtils;

public class StudentNext extends javax.swing.JFrame {

    public StudentNext() {
        initComponents();
    }
    
    
    public void ResetOb(){
        Question1.qob1=new Question1();
        Question2.qob2=new Question2();
        Question3.qob3=new Question3();
        Question4.qob4=new Question4();
        Question5.qob5=new Question5();
    }
    
    public int getRand(int serialnum){
        int rand = 0;
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            Stat=conn.createStatement();
            rs = Stat.executeQuery("select * from onlineexam.scorerand");
            while(rs.next()){
            if(rs.getInt("serialnum")==serialnum){
                rand=rs.getInt("random");
            }
        }
        }
        catch(SQLException | HeadlessException e){
            System.out.println("Error"+e);
        } 
        finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
        return rand;
    }
    
    public void setQuestion(JLabel label,int serialnum){
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        PreparedStatement pst2=null;
        String ques=null;
        String correct=null;
        int numchoice=0;
        try{
            //Question table
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            Stat=conn.createStatement();
            rs = Stat.executeQuery("select * from onlineexam.mcq");
            while(rs.next())
            {
                int num=rs.getInt("questionno");
                if(getRand(serialnum)==num) {
                    label.setText(rs.getString("question"));
                    ques=rs.getString("question");
                    numchoice=rs.getInt("ans");
                    correct=rs.getString(2+numchoice);
                }
            }
            pst2 = conn.prepareStatement("update onlineexam.viewtable set Question=?,correct_answer=? where randomnum=?");
            pst2.setString(1,ques);
            pst2.setString(2,correct);
            pst2.setInt(3,getRand(serialnum));
            pst2.executeUpdate();
        }
        catch(SQLException | HeadlessException e){
            System.out.println("Error"+e);
        }    
        finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { pst2.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
    }
    
    public void setChoice(JRadioButton label,int serialnum,int choice){
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        try{
           //Question table
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            Stat=conn.createStatement();
            rs = Stat.executeQuery("select * from onlineexam.mcq");
            
            while(rs.next())
            {
                int num=rs.getInt("questionno");
                if(getRand(serialnum)==num) {
                    label.setText(rs.getString(choice+2));
                }
            }
        
        }
        catch(SQLException | HeadlessException e){
            System.out.println("Error"+e);
        }    
        finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
       }
    }
    
    public void checkAns(int serialnum,int choice){
        int score=0;
        Connection conn=null;
        Statement Stat=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        PreparedStatement pst2=null;
        String marked=null,correct=null;
        try{
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
                Stat=conn.createStatement();
                rs = Stat.executeQuery("select * from onlineexam.mcq");
                while(rs.next())
                {
                    if(getRand(serialnum)==rs.getInt("questionno")){
                        int num=rs.getInt("ans");
                        if( num==choice){
                            score=1;
                        }
                        else{
                            score=0;
                        }
                        marked=rs.getString(2+choice);
                    }
                }
                
                pst = conn.prepareStatement("update onlineexam.scorerand set score=? where random=?");
                pst.setInt(1,score);
                pst.setInt(2,getRand(serialnum));
                pst.executeUpdate();
                
                pst2 = conn.prepareStatement("update onlineexam.viewtable set score=?,marked_answer=? where randomnum=?");
                pst2.setInt(1,score);
                pst2.setString(2,marked);
                pst2.setInt(3,getRand(serialnum));
                pst2.executeUpdate();
            }
            catch(SQLException | HeadlessException e){
                System.out.println("Error");
            }   
            finally {
            try { rs.close(); } catch (Exception e) { /* ignored */ }
            try { pst.close(); } catch (Exception e) { /* ignored */ }
            try { pst2.close(); } catch (Exception e) { /* ignored */ }
            try { Stat.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
        }
        
    }
    
    private void resetTable(){
        Connection myConn=null;
        PreparedStatement pst=null;
       try{
            myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
            pst=myConn.prepareStatement("update onlineexam.viewtable set Question=?,correct_answer=?,marked_answer=?,score=? where serialnum=?");
            for(int i=1;i<=5;i++){
                pst.setString(1,"");
                pst.setString(2,"");
                pst.setString(3,"");
                pst.setInt(4,0);
                pst.setInt(5,i);
                pst.executeUpdate();
            }   
            
        }
        catch(SQLException | HeadlessException e){
            e.printStackTrace();
            System.out.println("Error");
        } 
       finally{
            try { pst.close(); } catch (Exception e) { /* ignored */ }
            try { myConn.close(); } catch (Exception e) { /* ignored */ }
       }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setText("NEXT");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Your Test will Begin Now");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("RULES:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("1) this quiz contains five questions");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 383, 74));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("2) each correct answer carries one mark");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("3) Wrong answers dont carry negative marking");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("5) Do not copy from your neighbour");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("You both will have a diffrent set of Questions ;)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("4) You have 60 seconds to finish all the questions.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("The test will automatically end after 60 seconds");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        ScoreRand sr=new ScoreRand();
        sr.reset();
        sr.createScore();
        sr.createRand();
        sr.insertAllQuery();
        resetTable();
        ResetOb();
        this.dispose();
        new QuizTimer().setVisible(true);
        new QuizTimer().count=60;
    }//GEN-LAST:event_startActionPerformed

    
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
            java.util.logging.Logger.getLogger(StudentNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentNext.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentNext().setVisible(true);
            }
        });
        
    }
       
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
