/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;

/**
 *
 * @author 20114
 */
public class MenuScreen extends javax.swing.JFrame {

    /**
     * Creates new form yuyu
     */
    public MenuScreen() {
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

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChessBoard");
        setLocation(new java.awt.Point(180, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton1.setText("vs. computer");
        kButton1.setToolTipText("");
        kButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(204, 153, 0));
        kButton1.setkBorderRadius(40);
        kButton1.setkEndColor(new java.awt.Color(204, 153, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(204, 153, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(204, 153, 0));
        kButton1.setkPressedColor(new java.awt.Color(204, 153, 0));
        kButton1.setkSelectedColor(new java.awt.Color(204, 153, 0));
        kButton1.setkStartColor(new java.awt.Color(204, 153, 0));
        getContentPane().add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        kButton2.setText("2-Players");
        kButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(204, 153, 0));
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(204, 153, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(204, 153, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(204, 153, 0));
        kButton2.setkPressedColor(new java.awt.Color(204, 153, 0));
        kButton2.setkSelectedColor(new java.awt.Color(204, 153, 0));
        kButton2.setkStartColor(new java.awt.Color(204, 153, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test/ChessBoard1.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        PlayerColorChoiceMenu nxtframe = new PlayerColorChoiceMenu();
        nxtframe.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        PlayerColorChoiceMenu nxtframe = new PlayerColorChoiceMenu();
        nxtframe.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        PlayerColorChoiceMenu nxtframe = new PlayerColorChoiceMenu();
        nxtframe.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}