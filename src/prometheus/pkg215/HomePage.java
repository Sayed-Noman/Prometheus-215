/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prometheus.pkg215;

/**
 *
 * @author Acer
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        main_base_panel = new javax.swing.JPanel();
        Request_button = new javax.swing.JButton();
        Homepage_login_button = new javax.swing.JButton();
        CreatAccount_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();
        Home_page_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_base_panel.setMaximumSize(new java.awt.Dimension(950, 510));
        main_base_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Request_button.setBackground(new java.awt.Color(1, 50, 67));
        Request_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Request_button.setForeground(new java.awt.Color(255, 255, 255));
        Request_button.setText("Request Form");
        Request_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request_buttonActionPerformed(evt);
            }
        });
        main_base_panel.add(Request_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 370, 40));

        Homepage_login_button.setBackground(new java.awt.Color(1, 50, 67));
        Homepage_login_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Homepage_login_button.setForeground(new java.awt.Color(255, 255, 255));
        Homepage_login_button.setText("Login");
        main_base_panel.add(Homepage_login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 370, 40));

        CreatAccount_button.setBackground(new java.awt.Color(1, 50, 67));
        CreatAccount_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        CreatAccount_button.setForeground(new java.awt.Color(255, 255, 255));
        CreatAccount_button.setText("Creat Account");
        CreatAccount_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatAccount_buttonActionPerformed(evt);
            }
        });
        main_base_panel.add(CreatAccount_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 370, 40));

        Exit_button.setBackground(new java.awt.Color(1, 50, 67));
        Exit_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Exit_button.setForeground(new java.awt.Color(255, 255, 255));
        Exit_button.setText("Exit");
        Exit_button.setActionCommand("Admin");
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });
        main_base_panel.add(Exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 370, 40));

        Home_page_background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_backgrounds\\Home_page_background.jpg")); // NOI18N
        Home_page_background.setText("jLabel1");
        main_base_panel.add(Home_page_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 960, 540));
        Home_page_background.getAccessibleContext().setAccessibleName("bacground_image_homepage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Exit_buttonActionPerformed

    private void Request_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Request_buttonActionPerformed

    private void CreatAccount_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatAccount_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreatAccount_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatAccount_button;
    private javax.swing.JButton Exit_button;
    private javax.swing.JLabel Home_page_background;
    private javax.swing.JButton Homepage_login_button;
    private javax.swing.JButton Request_button;
    private javax.swing.JPanel main_base_panel;
    // End of variables declaration//GEN-END:variables
}
