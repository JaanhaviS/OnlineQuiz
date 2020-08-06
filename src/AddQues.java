
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

class WrongChoiceException extends Exception{
    int choice;
    WrongChoiceException(int c){
        choice=c;
    }
    public String toString(){
        return ""+choice;
    }
}

public class AddQues extends javax.swing.JFrame {

    public AddQues() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        questiontext = new javax.swing.JTextField();
        choice1 = new javax.swing.JTextField();
        choice2 = new javax.swing.JTextField();
        choice3 = new javax.swing.JTextField();
        choice4 = new javax.swing.JTextField();
        correct_choice = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Question: ");

        jLabel2.setText("Enter Choice1:");

        jLabel3.setText("Enter Choice2:");

        jLabel4.setText("Enter Choice3:");

        jLabel5.setText("Enter Choice4:");

        jLabel6.setText("Enter Correct Choice Number:");

        Add.setText("Add Question");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questiontext)
                    .addComponent(choice1)
                    .addComponent(choice2)
                    .addComponent(choice3)
                    .addComponent(choice4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(correct_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 276, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(questiontext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(choice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(choice3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(choice4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(correct_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(back))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        Connection conn=null;
        PreparedStatement pst=null;
        try{
               
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","newrootpassword");
                String sql="Insert into onlineexam.mcq (questionno,question,option1,option2,option3,option4,ans) values(?,?,?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                int quesno=new ScoreRand().getQuesNum()+1;
                if( questiontext.getText().equals("") || choice1.getText().equals("") || choice2.getText().equals("") || choice3.getText().equals("")|| choice4.getText().equals("") ){
                    throw new NullPointerException();
                }
                int ans=Integer.parseInt(correct_choice.getText());
                if( ans <1 || ans >4){
                    correct_choice.setText(null);
                    throw new WrongChoiceException(ans);
                }
                pst.setInt(1,quesno);
                pst.setString(2,questiontext.getText());
                pst.setString(3,choice1.getText());
                pst.setString(4,choice2.getText());
                pst.setString(5,choice3.getText());
                pst.setString(6,choice4.getText());
                pst.setInt(7,ans);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Saved");
                questiontext.setText(null);
                choice1.setText(null);
                choice2.setText(null);
                choice3.setText(null);
                choice4.setText(null);
                correct_choice.setText(null);
            }
        catch(SQLException | HeadlessException e){
                System.out.println("Error");
            }   
        catch(NullPointerException e){
                JOptionPane.showMessageDialog(this,"No Fields should be left blank "+e);
            }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Choice Number should be an integer "+e);
            }
        catch(WrongChoiceException e){
                JOptionPane.showMessageDialog(this,"Enter number between 1-4 \nwrong choice--> "+e);
            }            
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Error in data "+e);
            }
            finally {
            try { pst.close(); } catch (Exception e) { /* ignored */ }
            try { conn.close(); } catch (Exception e) { /* ignored */ }
            
        }
    }//GEN-LAST:event_AddActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new ProfMenu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(AddQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQues().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton back;
    private javax.swing.JTextField choice1;
    private javax.swing.JTextField choice2;
    private javax.swing.JTextField choice3;
    private javax.swing.JTextField choice4;
    private javax.swing.JTextField correct_choice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField questiontext;
    // End of variables declaration//GEN-END:variables
}
