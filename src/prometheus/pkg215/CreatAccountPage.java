/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prometheus.pkg215;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class CreatAccountPage extends javax.swing.JFrame {

    
    //creating connection to database
    Connection connection;
    ResultSet rs;
    PreparedStatement pst;
    
    /**
     * Creates new form CreatAccountPage
     */
    public CreatAccountPage() {
        initComponents();
        //creating connection to accountpage with database
        connection=JavaDbConnect.databaseConnect();
        //theese code of line will set transparent textfields
        this.creatAccount_page_bacground_image.setBackground(new Color(0,0,0,0));
        firstName_textfield.setBackground(new Color(0,0,0,0));
        lastName_textfield.setBackground(new Color(0,0,0,0));
        username_textfield.setBackground(new Color(0,0,0,0));
        email_textfield.setBackground(new Color(0,0,0,0));
        password_textfield.setBackground(new Color(0,0,0,0));
        confirm_password_textfield.setBackground(new Color(0,0,0,0));
        answer_textfield.setBackground(new Color(0,0,0,0));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        create_account_base_panel = new javax.swing.JPanel();
        lastName_label = new javax.swing.JLabel();
        lastName_textfield = new javax.swing.JTextField();
        answer_label = new javax.swing.JLabel();
        answer_textfield = new javax.swing.JTextField();
        confirm_password_label = new javax.swing.JLabel();
        confirm_password_textfield = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        username_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        admin_type_label = new javax.swing.JLabel();
        security_question_label = new javax.swing.JLabel();
        firstName_textfield = new javax.swing.JTextField();
        password_textfield = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        password_label = new javax.swing.JLabel();
        security_question_combobox = new javax.swing.JComboBox<>();
        email_label = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        agree_checkbox = new javax.swing.JCheckBox();
        terms_and_condition_label = new javax.swing.JLabel();
        creat_account_button = new javax.swing.JButton();
        firstName_label = new javax.swing.JLabel();
        admin_type_combobox = new javax.swing.JComboBox<>();
        exitpage_button = new javax.swing.JButton();
        homepage_button = new javax.swing.JButton();
        creatAccount_page_bacground_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(980, 610));

        create_account_base_panel.setPreferredSize(new java.awt.Dimension(980, 610));
        create_account_base_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastName_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        lastName_label.setForeground(new java.awt.Color(255, 255, 255));
        lastName_label.setText("Last Name");
        create_account_base_panel.add(lastName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 210, 40));

        lastName_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        lastName_textfield.setForeground(new java.awt.Color(51, 51, 51));
        lastName_textfield.setText("Enter your Last Name");
        lastName_textfield.setBorder(null);
        lastName_textfield.setOpaque(false);
        create_account_base_panel.add(lastName_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 210, 40));

        answer_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        answer_label.setForeground(new java.awt.Color(255, 255, 255));
        answer_label.setText("Answer");
        create_account_base_panel.add(answer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 210, 40));

        answer_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        answer_textfield.setForeground(new java.awt.Color(51, 51, 51));
        answer_textfield.setText("Enter your answer");
        answer_textfield.setBorder(null);
        answer_textfield.setOpaque(false);
        answer_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_textfieldActionPerformed(evt);
            }
        });
        create_account_base_panel.add(answer_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 440, 40));

        confirm_password_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        confirm_password_label.setForeground(new java.awt.Color(255, 255, 255));
        confirm_password_label.setText("Confirm Password");
        create_account_base_panel.add(confirm_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 210, 40));

        confirm_password_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        confirm_password_textfield.setForeground(new java.awt.Color(51, 51, 51));
        confirm_password_textfield.setText("Retype your password");
        confirm_password_textfield.setBorder(null);
        confirm_password_textfield.setOpaque(false);
        create_account_base_panel.add(confirm_password_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 210, 40));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 210, 20));

        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 210, 20));

        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 440, 20));

        username_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username");
        create_account_base_panel.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 210, 40));

        username_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        username_textfield.setForeground(new java.awt.Color(51, 51, 51));
        username_textfield.setText("Enter your username");
        username_textfield.setBorder(null);
        username_textfield.setOpaque(false);
        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });
        create_account_base_panel.add(username_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 440, 40));

        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 440, 20));

        admin_type_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        admin_type_label.setForeground(new java.awt.Color(255, 255, 255));
        admin_type_label.setText("Admin Type");
        create_account_base_panel.add(admin_type_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 150, 40));

        security_question_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        security_question_label.setForeground(new java.awt.Color(255, 255, 255));
        security_question_label.setText("Security Question");
        create_account_base_panel.add(security_question_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 160, 40));

        firstName_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        firstName_textfield.setForeground(new java.awt.Color(51, 51, 51));
        firstName_textfield.setText("Enter your First Name");
        firstName_textfield.setBorder(null);
        firstName_textfield.setOpaque(false);
        create_account_base_panel.add(firstName_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 210, 40));

        password_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        password_textfield.setForeground(new java.awt.Color(51, 51, 51));
        password_textfield.setText("Enter your password");
        password_textfield.setBorder(null);
        password_textfield.setOpaque(false);
        create_account_base_panel.add(password_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 210, 40));

        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 210, 20));

        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 210, 20));

        jSeparator7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        create_account_base_panel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 440, 20));

        password_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");
        create_account_base_panel.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 210, 40));

        security_question_combobox.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        security_question_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Who is the best player Messi or Ronaldo?", "Who the best defender Ramos or pique?", "Who is the best GK Courtois or Navas?", "Who is best Coach Zidane or Mourniho?" }));
        create_account_base_panel.add(security_question_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 280, 40));

        email_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email");
        create_account_base_panel.add(email_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 210, 40));

        email_textfield.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        email_textfield.setForeground(new java.awt.Color(51, 51, 51));
        email_textfield.setText("Enter Your Email");
        email_textfield.setBorder(null);
        email_textfield.setOpaque(false);
        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });
        create_account_base_panel.add(email_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 440, 40));

        agree_checkbox.setForeground(new java.awt.Color(0, 0, 204));
        agree_checkbox.setText("Agree");
        agree_checkbox.setOpaque(false);
        create_account_base_panel.add(agree_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 60, 30));

        terms_and_condition_label.setForeground(new java.awt.Color(102, 102, 102));
        terms_and_condition_label.setText("<html>\n  <body>\n<u>terms & conditions</u>\n</body>\n</html>");
        create_account_base_panel.add(terms_and_condition_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 120, 30));

        creat_account_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        creat_account_button.setForeground(new java.awt.Color(255, 255, 255));
        creat_account_button.setText("Create Account");
        creat_account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creat_account_buttonActionPerformed(evt);
            }
        });
        create_account_base_panel.add(creat_account_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, 160, 50));

        firstName_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        firstName_label.setForeground(new java.awt.Color(255, 255, 255));
        firstName_label.setText("First Name");
        create_account_base_panel.add(firstName_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 210, 40));

        admin_type_combobox.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        admin_type_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Traffic Police", "Driver" }));
        create_account_base_panel.add(admin_type_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 140, 40));

        exitpage_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        exitpage_button.setForeground(new java.awt.Color(255, 255, 255));
        exitpage_button.setText("Exit");
        exitpage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitpage_buttonActionPerformed(evt);
            }
        });
        create_account_base_panel.add(exitpage_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, 40));

        homepage_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        homepage_button.setForeground(new java.awt.Color(255, 255, 255));
        homepage_button.setText("Home");
        homepage_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homepage_buttonActionPerformed(evt);
            }
        });
        create_account_base_panel.add(homepage_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        creatAccount_page_bacground_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_backgrounds\\CreatAccount_page_background.jpg")); // NOI18N
        create_account_base_panel.add(creatAccount_page_bacground_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(create_account_base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(create_account_base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(996, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void answer_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer_textfieldActionPerformed

    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textfieldActionPerformed

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textfieldActionPerformed

    private void creat_account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creat_account_buttonActionPerformed
        // TODO add your handling code here:
        try{
            String sql="Insert into accounts (FirstName,LastName,UserName,Email,Password,ConfirmPassword,SecurityQuestion,SecurityQuestionAnswer,AdminType) values (?,?,?,?,?,?,?,?,?)";
            pst=connection.prepareStatement(sql);
            pst.setString(1,firstName_textfield.getText());
            pst.setString(2,lastName_textfield.getText());
            pst.setString(3,username_textfield.getText());
            pst.setString(4,email_textfield.getText());
            pst.setString(5,password_textfield.getText());
            pst.setString(6,confirm_password_textfield.getText());
            pst.setString(7,(String)security_question_combobox.getSelectedItem());
            pst.setString(8,answer_textfield.getText());
            pst.setString(9,(String) admin_type_combobox.getSelectedItem());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Account Successfully Created");
            
            
             
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } finally {
            try {
                rs.close();
                pst.close();
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_creat_account_buttonActionPerformed

    private void homepage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homepage_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        HomePage hp= new HomePage();
        hp.setVisible(true);
    }//GEN-LAST:event_homepage_buttonActionPerformed

    private void exitpage_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitpage_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitpage_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(CreatAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatAccountPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatAccountPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> admin_type_combobox;
    private javax.swing.JLabel admin_type_label;
    private javax.swing.JCheckBox agree_checkbox;
    private javax.swing.JLabel answer_label;
    private javax.swing.JTextField answer_textfield;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JTextField confirm_password_textfield;
    private javax.swing.JLabel creatAccount_page_bacground_image;
    private javax.swing.JButton creat_account_button;
    private javax.swing.JPanel create_account_base_panel;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_textfield;
    private javax.swing.JButton exitpage_button;
    private javax.swing.JLabel firstName_label;
    private javax.swing.JTextField firstName_textfield;
    private javax.swing.JButton homepage_button;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lastName_label;
    private javax.swing.JTextField lastName_textfield;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField password_textfield;
    private javax.swing.JComboBox<String> security_question_combobox;
    private javax.swing.JLabel security_question_label;
    private javax.swing.JLabel terms_and_condition_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_textfield;
    // End of variables declaration//GEN-END:variables
}
