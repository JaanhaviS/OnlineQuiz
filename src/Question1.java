
public class Question1 extends javax.swing.JFrame {

    
    int score=0;
    StudentNext sn=new StudentNext();
    static Question1 qob1=new Question1();
    
    public Question1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        choice1_1 = new javax.swing.JRadioButton();
        Q1 = new javax.swing.JLabel();
        choice2_1 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        choice3_1 = new javax.swing.JRadioButton();
        choice4_1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        buttonGroup1.add(choice1_1);
        choice1_1.setText("A");
        choice1_1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice1_1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1_1ActionPerformed(evt);
            }
        });

        Q1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Q1.setText("Question");
        Q1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Q1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        buttonGroup1.add(choice2_1);
        choice2_1.setText("B");
        choice2_1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice2_1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2_1ActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice3_1);
        choice3_1.setText("C");
        choice3_1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice3_1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice4_1);
        choice4_1.setText("D");
        choice4_1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice4_1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4_1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("1)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q1))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(choice1_1))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(choice2_1))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(choice3_1))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(choice4_1))
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(next))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q1)
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addComponent(choice1_1)
                .addGap(41, 41, 41)
                .addComponent(choice2_1)
                .addGap(41, 41, 41)
                .addComponent(choice3_1)
                .addGap(41, 41, 41)
                .addComponent(choice4_1)
                .addGap(41, 41, 41)
                .addComponent(next))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Q1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Q1AncestorAdded
        sn.setQuestion(Q1, 1);
    }//GEN-LAST:event_Q1AncestorAdded

    private void choice2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2_1ActionPerformed
        sn.checkAns(1,2);
    }//GEN-LAST:event_choice2_1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        qob1.setVisible(false);
        new Question2().qob2.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void choice1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1_1ActionPerformed
        sn.checkAns(1,1);
    }//GEN-LAST:event_choice1_1ActionPerformed

    private void choice3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3_1ActionPerformed
        sn.checkAns(1,3); 
    }//GEN-LAST:event_choice3_1ActionPerformed

    private void choice4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4_1ActionPerformed
        sn.checkAns(1,4); 
    }//GEN-LAST:event_choice4_1ActionPerformed

    private void choice1_1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice1_1AncestorAdded
        sn.setChoice(choice1_1,1,1);
    }//GEN-LAST:event_choice1_1AncestorAdded

    private void choice2_1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice2_1AncestorAdded
        sn.setChoice(choice2_1,1,2);
    }//GEN-LAST:event_choice2_1AncestorAdded

    private void choice3_1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice3_1AncestorAdded
        sn.setChoice(choice3_1,1,3);
    }//GEN-LAST:event_choice3_1AncestorAdded

    private void choice4_1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice4_1AncestorAdded
        sn.setChoice(choice4_1,1,4);
    }//GEN-LAST:event_choice4_1AncestorAdded


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
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Question1().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton choice1_1;
    private javax.swing.JRadioButton choice2_1;
    private javax.swing.JRadioButton choice3_1;
    private javax.swing.JRadioButton choice4_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
