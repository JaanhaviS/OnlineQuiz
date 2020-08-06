
public class Question2 extends javax.swing.JFrame {
    int score=0;
    StudentNext sn=new StudentNext();       
    static Question2 qob2=new Question2();
    
    public Question2() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        back = new javax.swing.JButton();
        end = new javax.swing.JButton();
        choice1 = new javax.swing.JRadioButton();
        choice2 = new javax.swing.JRadioButton();
        choice3 = new javax.swing.JRadioButton();
        choice4 = new javax.swing.JRadioButton();
        Q2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        end.setText("Next");
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice1);
        choice1.setText("A");
        choice1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice2);
        choice2.setText("B");
        choice2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice3);
        choice3.setText("C");
        choice3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(choice4);
        choice4.setText("D");
        choice4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                choice4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        choice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choice4ActionPerformed(evt);
            }
        });

        Q2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Q2.setText("Question");
        Q2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Q2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("2)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Q2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(choice1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(choice2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(choice3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(choice4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(back)
                        .addGap(315, 315, 315)
                        .addComponent(end)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addComponent(choice1)
                .addGap(24, 24, 24)
                .addComponent(choice2)
                .addGap(24, 24, 24)
                .addComponent(choice3)
                .addGap(24, 24, 24)
                .addComponent(choice4)
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(end)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        qob2.setVisible(false);
        new Question1().qob1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void choice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ActionPerformed
        sn.checkAns(2,1);
    }//GEN-LAST:event_choice1ActionPerformed

    private void choice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ActionPerformed
        sn.checkAns(2,2);
    }//GEN-LAST:event_choice2ActionPerformed

    private void choice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ActionPerformed
        sn.checkAns(2,3);
    }//GEN-LAST:event_choice3ActionPerformed

    private void choice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ActionPerformed
       sn.checkAns(2,4);
    }//GEN-LAST:event_choice4ActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        qob2.setVisible(false);
        new Question3().qob3.setVisible(true);
    }//GEN-LAST:event_endActionPerformed

    private void Q2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Q2AncestorAdded
        sn.setQuestion(Q2,2);
    }//GEN-LAST:event_Q2AncestorAdded

    private void choice1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice1AncestorAdded
        sn.setChoice(choice1,2,1);
    }//GEN-LAST:event_choice1AncestorAdded

    private void choice2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice2AncestorAdded
        sn.setChoice(choice2,2,2);
    }//GEN-LAST:event_choice2AncestorAdded

    private void choice3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice3AncestorAdded
        sn.setChoice(choice3,2,3);
    }//GEN-LAST:event_choice3AncestorAdded

    private void choice4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice4AncestorAdded
        sn.setChoice(choice4,2,4);
    }//GEN-LAST:event_choice4AncestorAdded

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
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q2;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton choice1;
    private javax.swing.JRadioButton choice2;
    private javax.swing.JRadioButton choice3;
    private javax.swing.JRadioButton choice4;
    private javax.swing.JButton end;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
