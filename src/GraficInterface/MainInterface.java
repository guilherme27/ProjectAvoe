/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficInterface;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author guisi
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
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

        BG_Main = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_Entrega = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Drones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Usuários = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_LocaisdeEntrega = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        side_Panel = new javax.swing.JPanel();
        WorkPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Avoe");

        BG_Main.setBackground(new java.awt.Color(0, 0, 0));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/iconSup.png"))); // NOI18N

        btn_Entrega.setBackground(new java.awt.Color(204, 204, 204));
        btn_Entrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EntregaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EntregaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EntregaMouseExited(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Package_52px.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entregas");

        javax.swing.GroupLayout btn_EntregaLayout = new javax.swing.GroupLayout(btn_Entrega);
        btn_Entrega.setLayout(btn_EntregaLayout);
        btn_EntregaLayout.setHorizontalGroup(
            btn_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_EntregaLayout.setVerticalGroup(
            btn_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_EntregaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Drones.setBackground(new java.awt.Color(255, 255, 255));
        btn_Drones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        btn_Drones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DronesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_DronesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_DronesMouseExited(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Quadcopter_54px.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Drones");

        javax.swing.GroupLayout btn_DronesLayout = new javax.swing.GroupLayout(btn_Drones);
        btn_Drones.setLayout(btn_DronesLayout);
        btn_DronesLayout.setHorizontalGroup(
            btn_DronesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_DronesLayout.setVerticalGroup(
            btn_DronesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_DronesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_Usuários.setBackground(new java.awt.Color(255, 255, 255));
        btn_Usuários.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        btn_Usuários.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UsuáriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_UsuáriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_UsuáriosMouseExited(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_User_Group_Man_Man_54px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Usuários");

        javax.swing.GroupLayout btn_UsuáriosLayout = new javax.swing.GroupLayout(btn_Usuários);
        btn_Usuários.setLayout(btn_UsuáriosLayout);
        btn_UsuáriosLayout.setHorizontalGroup(
            btn_UsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_UsuáriosLayout.setVerticalGroup(
            btn_UsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_UsuáriosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_LocaisdeEntrega.setBackground(new java.awt.Color(255, 255, 255));
        btn_LocaisdeEntrega.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(240, 240, 240)));
        btn_LocaisdeEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LocaisdeEntregaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LocaisdeEntregaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LocaisdeEntregaMouseExited(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Marker_54px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Locais de Entrega");

        javax.swing.GroupLayout btn_LocaisdeEntregaLayout = new javax.swing.GroupLayout(btn_LocaisdeEntrega);
        btn_LocaisdeEntrega.setLayout(btn_LocaisdeEntregaLayout);
        btn_LocaisdeEntregaLayout.setHorizontalGroup(
            btn_LocaisdeEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btn_LocaisdeEntregaLayout.setVerticalGroup(
            btn_LocaisdeEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_LocaisdeEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        side_Panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout side_PanelLayout = new javax.swing.GroupLayout(side_Panel);
        side_Panel.setLayout(side_PanelLayout);
        side_PanelLayout.setHorizontalGroup(
            side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        side_PanelLayout.setVerticalGroup(
            side_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        WorkPanel.setBackground(new java.awt.Color(255, 255, 255));
        WorkPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WorkPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Customer_15px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Settings_17px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BG_MainLayout = new javax.swing.GroupLayout(BG_Main);
        BG_Main.setLayout(BG_MainLayout);
        BG_MainLayout.setHorizontalGroup(
            BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_MainLayout.createSequentialGroup()
                .addGroup(BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_LocaisdeEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Usuários, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Drones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG_MainLayout.createSequentialGroup()
                        .addGap(0, 747, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(WorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE))
                .addContainerGap())
        );
        BG_MainLayout.setVerticalGroup(
            BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_MainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BG_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WorkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BG_MainLayout.createSequentialGroup()
                        .addComponent(btn_Entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Drones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_Usuários, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_LocaisdeEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(side_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntregaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntregaMouseEntered
        setBorda(btn_Entrega);
    }//GEN-LAST:event_btn_EntregaMouseEntered

    private void btn_EntregaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntregaMouseExited
        resetBorda(btn_Entrega);
    }//GEN-LAST:event_btn_EntregaMouseExited

    private void btn_DronesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DronesMouseEntered
        setBorda(btn_Drones);
    }//GEN-LAST:event_btn_DronesMouseEntered

    private void btn_DronesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DronesMouseExited
        resetBorda(btn_Drones);
    }//GEN-LAST:event_btn_DronesMouseExited

    private void btn_UsuáriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuáriosMouseEntered
        setBorda(btn_Usuários);
    }//GEN-LAST:event_btn_UsuáriosMouseEntered

    private void btn_UsuáriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuáriosMouseExited
        resetBorda(btn_Usuários);
    }//GEN-LAST:event_btn_UsuáriosMouseExited

    private void btn_LocaisdeEntregaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LocaisdeEntregaMouseEntered
        setBorda(btn_LocaisdeEntrega);
    }//GEN-LAST:event_btn_LocaisdeEntregaMouseEntered

    private void btn_LocaisdeEntregaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LocaisdeEntregaMouseExited
        resetBorda(btn_LocaisdeEntrega);
    }//GEN-LAST:event_btn_LocaisdeEntregaMouseExited

    private void btn_EntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EntregaMouseClicked
        setColor(btn_Entrega);
        resetColor(btn_Drones);
        resetColor(btn_Usuários);
        resetColor(btn_LocaisdeEntrega);
    }//GEN-LAST:event_btn_EntregaMouseClicked

    private void btn_DronesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DronesMouseClicked
        setColor(btn_Drones);
        resetColor(btn_Entrega);
        resetColor(btn_Usuários);
        resetColor(btn_LocaisdeEntrega);
    }//GEN-LAST:event_btn_DronesMouseClicked

    private void btn_UsuáriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuáriosMouseClicked
        setColor(btn_Usuários);
        resetColor(btn_Drones);
        resetColor(btn_Entrega);
        resetColor(btn_LocaisdeEntrega);
    }//GEN-LAST:event_btn_UsuáriosMouseClicked

    private void btn_LocaisdeEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LocaisdeEntregaMouseClicked
        setColor(btn_LocaisdeEntrega);
        resetColor(btn_Drones);
        resetColor(btn_Entrega);
        resetColor(btn_Usuários);
    }//GEN-LAST:event_btn_LocaisdeEntregaMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Customer_26px.png")));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Customer_15px.png")));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Settings_26px.png")));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GraficInterface/icons/icons8_Settings_17px.png")));
    }//GEN-LAST:event_jLabel12MouseExited

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_Main;
    private javax.swing.JPanel WorkPanel;
    private javax.swing.JPanel btn_Drones;
    private javax.swing.JPanel btn_Entrega;
    private javax.swing.JPanel btn_LocaisdeEntrega;
    private javax.swing.JPanel btn_Usuários;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel side_Panel;
    // End of variables declaration//GEN-END:variables
    
    private void setBorda(JPanel painel){
        painel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }
    
    private void resetBorda(JPanel painel){
        painel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
    }
    
    private void setColor(JPanel jPanel1) {
        jPanel1.setBackground(new Color(204,204,204));
    }
    
    private void resetColor(JPanel jPanel1) {
        jPanel1.setBackground(new Color(255,255,255));
    }

}
