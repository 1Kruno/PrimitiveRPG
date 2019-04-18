/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javax.swing.JOptionPane;

/**
 *
 * @author kruno
 */
public class CharacterStatsGUI extends javax.swing.JFrame {

    Character c = new Character();
    
    static int xhealth = 1;
    static int xspeech = 1;
    static int xspeed = 1;
    static int xinvestigation = 1;
    static int xattack = 1;
    static int xdefense = 1;
    
    static int skillPoints = 10;
    /**
     * Creates new form CharacterStatsGUI
     */
    public CharacterStatsGUI() {
        initComponents();
        txtpoints.setText(String.valueOf(skillPoints));
        txthealth.setText(String.valueOf(xhealth));
        txtspeech.setText(String.valueOf(xspeech));
        txtspeed.setText(String.valueOf(xspeed));
        txtinvestigation.setText(String.valueOf(xinvestigation));
        txtattack.setText(String.valueOf(xattack));
        txtdefense.setText(String.valueOf(xdefense));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhp = new javax.swing.JButton();
        btnhm = new javax.swing.JButton();
        btnspeechp = new javax.swing.JButton();
        btnspeechm = new javax.swing.JButton();
        btnsp = new javax.swing.JButton();
        btnsm = new javax.swing.JButton();
        btnip = new javax.swing.JButton();
        btnim = new javax.swing.JButton();
        btnap = new javax.swing.JButton();
        btnam = new javax.swing.JButton();
        btndp = new javax.swing.JButton();
        btndm = new javax.swing.JButton();
        txthealth = new javax.swing.JTextField();
        txtspeech = new javax.swing.JTextField();
        txtspeed = new javax.swing.JTextField();
        txtinvestigation = new javax.swing.JTextField();
        txtattack = new javax.swing.JTextField();
        txtdefense = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        txtpoints = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnhp.setText("+");
        btnhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhpActionPerformed(evt);
            }
        });

        btnhm.setText("-");
        btnhm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhmActionPerformed(evt);
            }
        });

        btnspeechp.setText("+");
        btnspeechp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspeechpActionPerformed(evt);
            }
        });

        btnspeechm.setText("-");
        btnspeechm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspeechmActionPerformed(evt);
            }
        });

        btnsp.setText("+");
        btnsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspActionPerformed(evt);
            }
        });

        btnsm.setText("-");
        btnsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsmActionPerformed(evt);
            }
        });

        btnip.setText("+");
        btnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnipActionPerformed(evt);
            }
        });

        btnim.setText("-");
        btnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimActionPerformed(evt);
            }
        });

        btnap.setText("+");
        btnap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapActionPerformed(evt);
            }
        });

        btnam.setText("-");
        btnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnamActionPerformed(evt);
            }
        });

        btndp.setText("+");
        btndp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndpActionPerformed(evt);
            }
        });

        btndm.setText("-");
        btndm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndmActionPerformed(evt);
            }
        });

        txthealth.setEditable(false);
        txthealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthealthActionPerformed(evt);
            }
        });

        txtspeech.setEditable(false);
        txtspeech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspeechActionPerformed(evt);
            }
        });

        txtspeed.setEditable(false);
        txtspeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtspeedActionPerformed(evt);
            }
        });

        txtinvestigation.setEditable(false);
        txtinvestigation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinvestigationActionPerformed(evt);
            }
        });

        txtattack.setEditable(false);
        txtattack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtattackActionPerformed(evt);
            }
        });

        txtdefense.setEditable(false);
        txtdefense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdefenseActionPerformed(evt);
            }
        });

        jLabel1.setText("Health");

        jLabel2.setText("Speech");

        jLabel3.setText("Speed");

        jLabel4.setText("Investigation");

        jLabel5.setText("Attack");

        jLabel6.setText("Defense");

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        txtpoints.setEditable(false);
        txtpoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpointsActionPerformed(evt);
            }
        });

        jLabel7.setText("Points");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtpoints, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnspeechp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnip))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnap))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtspeech)
                            .addComponent(txtinvestigation)
                            .addComponent(txtattack)
                            .addComponent(txtdefense)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtspeed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnhm)
                            .addComponent(btnsm)
                            .addComponent(btnspeechm)
                            .addComponent(btnim)
                            .addComponent(btnam)
                            .addComponent(btndm))
                        .addGap(85, 85, 85))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btncancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsave)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhp)
                    .addComponent(btnhm)
                    .addComponent(jLabel1)
                    .addComponent(txtpoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnspeechp)
                    .addComponent(btnspeechm)
                    .addComponent(txtspeech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsp)
                    .addComponent(btnsm)
                    .addComponent(txtspeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnip)
                    .addComponent(btnim)
                    .addComponent(txtinvestigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnap)
                    .addComponent(btnam)
                    .addComponent(txtattack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndp)
                    .addComponent(btndm)
                    .addComponent(txtdefense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancel)
                    .addComponent(btnsave))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txthealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthealthActionPerformed
        // TODO add your handling code here:
        txthealth.setText(String.valueOf(xhealth));
    }//GEN-LAST:event_txthealthActionPerformed

    private void btnhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhpActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){
        xhealth++;
        skillPoints--;
        txthealth.setText(String.valueOf(xhealth));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
        
        
    }//GEN-LAST:event_btnhpActionPerformed

    private void btnhmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhmActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xhealth > 1){
        xhealth--;
        skillPoints++;
        txthealth.setText(String.valueOf(xhealth));
         txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
        
    }//GEN-LAST:event_btnhmActionPerformed

    private void txtspeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspeechActionPerformed
        // TODO add your handling code here:
        txtspeech.setText(String.valueOf(xspeech));
    }//GEN-LAST:event_txtspeechActionPerformed

    private void btnspeechmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspeechmActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xspeech > 1){
        xspeech--;
        skillPoints++;
        txtspeech.setText(String.valueOf(xspeech));
         txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
    }//GEN-LAST:event_btnspeechmActionPerformed

    private void btnspeechpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspeechpActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){
        xspeech++;
        skillPoints--;
        txtspeech.setText(String.valueOf(xspeech));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
    }//GEN-LAST:event_btnspeechpActionPerformed

    private void txtspeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtspeedActionPerformed
        // TODO add your handling code here:
        txtspeed.setText(String.valueOf(xspeed));
    }//GEN-LAST:event_txtspeedActionPerformed

    private void btnsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsmActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xspeed > 1){
        xspeed--;
        skillPoints++;
        txtspeed.setText(String.valueOf(xspeed));
         txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
    }//GEN-LAST:event_btnsmActionPerformed

    private void btnspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){ 
        xspeed++;
        skillPoints--;
        txtspeed.setText(String.valueOf(xspeed));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
    }//GEN-LAST:event_btnspActionPerformed

    private void txtinvestigationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinvestigationActionPerformed
        // TODO add your handling code here:
        txtinvestigation.setText(String.valueOf(xinvestigation));
    }//GEN-LAST:event_txtinvestigationActionPerformed

    private void btnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xinvestigation > 1){
         xinvestigation--;
         skillPoints++;
        txtinvestigation.setText(String.valueOf(xinvestigation));
         txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
    }//GEN-LAST:event_btnimActionPerformed

    private void btnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnipActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){
        xinvestigation++;
        skillPoints--;
        txtinvestigation.setText(String.valueOf(xinvestigation));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
    }//GEN-LAST:event_btnipActionPerformed

    private void txtattackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtattackActionPerformed
        // TODO add your handling code here:
        txtattack.setText(String.valueOf(xattack));
    }//GEN-LAST:event_txtattackActionPerformed

    private void btnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnamActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xattack > 1){
        xattack--;
        skillPoints++;
        txtattack.setText(String.valueOf(xattack));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
    }//GEN-LAST:event_btnamActionPerformed

    private void btnapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){
        xattack++;
         skillPoints--;
        txtattack.setText(String.valueOf(xattack));
        txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
    }//GEN-LAST:event_btnapActionPerformed

    private void txtdefenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdefenseActionPerformed
        // TODO add your handling code here:
        txtdefense.setText(String.valueOf(xdefense));
    }//GEN-LAST:event_txtdefenseActionPerformed

    private void btndmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndmActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 0 && xdefense > 1){
        xdefense--;
        skillPoints++;
         txtdefense.setText(String.valueOf(xdefense));
          txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "Minimum skill value is 1.");
        }
    }//GEN-LAST:event_btndmActionPerformed

    private void btndpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndpActionPerformed
        // TODO add your handling code here:
        if(skillPoints >= 1){
        xdefense++;
        skillPoints--;
         txtdefense.setText(String.valueOf(xdefense));
         txtpoints.setText(String.valueOf(skillPoints));
        }
        else{
            JOptionPane.showMessageDialog(null, "You dont have enough skills points");
        }
    }//GEN-LAST:event_btndpActionPerformed

    private void txtpointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpointsActionPerformed
        // TODO add your handling code here:
        txtpoints.setText(String.valueOf(skillPoints));
    }//GEN-LAST:event_txtpointsActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
    c.setHealth(xhealth);
    c.setSpeech(xspeech);
    c.setSpeed(xspeed);
    c.setInvestigation(xinvestigation);
    c.setAttack(xattack);
    c.setDefense(xdefense);
    
    c.saveCharacterStats();
        
        JOptionPane.showMessageDialog(null,c.stats());
        
        dispose();
        Story1GUI s1 = new Story1GUI();
        s1.setVisible(true);
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        StartMenuGUI smGUI = new StartMenuGUI();
        smGUI.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterStatsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterStatsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterStatsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterStatsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterStatsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnam;
    private javax.swing.JButton btnap;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndm;
    private javax.swing.JButton btndp;
    private javax.swing.JButton btnhm;
    private javax.swing.JButton btnhp;
    private javax.swing.JButton btnim;
    private javax.swing.JButton btnip;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsm;
    private javax.swing.JButton btnsp;
    private javax.swing.JButton btnspeechm;
    private javax.swing.JButton btnspeechp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtattack;
    private javax.swing.JTextField txtdefense;
    private javax.swing.JTextField txthealth;
    private javax.swing.JTextField txtinvestigation;
    private javax.swing.JTextField txtpoints;
    private javax.swing.JTextField txtspeech;
    private javax.swing.JTextField txtspeed;
    // End of variables declaration//GEN-END:variables
}