
public class Question5 extends javax.swing.JFrame {

    int score=0;
    StudentNext sn=new StudentNext();       
    static Question5 qob5=new Question5();
    
    public Question5() {
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
        Q5 = new javax.swing.JLabel();
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

        Q5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Q5.setText("Question");
        Q5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Q5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("5)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Q5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(choice1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(choice2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(choice3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(choice4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(back)
                        .addGap(315, 315, 315)
                        .addComponent(end)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Q5))
                .addGap(50, 50, 50)
                .addComponent(choice1)
                .addGap(21, 21, 21)
                .addComponent(choice2)
                .addGap(21, 21, 21)
                .addComponent(choice3)
                .addGap(21, 21, 21)
                .addComponent(choice4)
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(end)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        qob5.setVisible(false);
        new Question4().qob4.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        qob5.setVisible(false);
        new TestEnd().setVisible(true);
    }//GEN-LAST:event_endActionPerformed

    private void choice1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice1AncestorAdded
        sn.setChoice(choice1,5,1);
    }//GEN-LAST:event_choice1AncestorAdded

    private void choice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice1ActionPerformed
        sn.checkAns(5,1);
    }//GEN-LAST:event_choice1ActionPerformed

    private void choice2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice2AncestorAdded
        sn.setChoice(choice2,5,2);
    }//GEN-LAST:event_choice2AncestorAdded

    private void choice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice2ActionPerformed
        sn.checkAns(5,2);
    }//GEN-LAST:event_choice2ActionPerformed

    private void choice3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice3AncestorAdded
        sn.setChoice(choice3,5,3);
    }//GEN-LAST:event_choice3AncestorAdded

    private void choice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice3ActionPerformed
        sn.checkAns(5,3);
    }//GEN-LAST:event_choice3ActionPerformed

    private void choice4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_choice4AncestorAdded
        sn.setChoice(choice4,5,4);
    }//GEN-LAST:event_choice4AncestorAdded

    private void choice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choice4ActionPerformed
        sn.checkAns(5,4);
    }//GEN-LAST:event_choice4ActionPerformed

    private void Q5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Q5AncestorAdded
        sn.setQuestion(Q5,5);
    }//GEN-LAST:event_Q5AncestorAdded

    
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
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Q5;
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
