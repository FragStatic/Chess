/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yolos
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null); //Centers form
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        RegisterLabel = new javax.swing.JLabel();
        RegisterMinimizeButton = new javax.swing.JLabel();
        RegisterExitButton = new javax.swing.JLabel();
        RegUsernameText = new javax.swing.JLabel();
        RegisterEmailText = new javax.swing.JLabel();
        RegisterPasswordText = new javax.swing.JLabel();
        RegisterRePasswordText = new javax.swing.JLabel();
        RegisterSkillText = new javax.swing.JLabel();
        RegisterDoneButton = new javax.swing.JButton();
        RegisterUsernameLabel = new javax.swing.JTextField();
        RegisterEmailLabel = new javax.swing.JTextField();
        RegisterPasswordLabel = new javax.swing.JPasswordField();
        RegisterRePasswordLabel = new javax.swing.JPasswordField();
        RegisterSkillCombobox = new javax.swing.JComboBox<>();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        RegisterLabel.setText("Register");

        RegisterMinimizeButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        RegisterMinimizeButton.setText("-");
        RegisterMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMinimizeButtonMouseClicked(evt);
            }
        });

        RegisterExitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegisterExitButton.setText("X");
        RegisterExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterExitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(RegisterMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterExitButton)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterExitButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegUsernameText.setText("Username");

        RegisterEmailText.setText("E-mail");

        RegisterPasswordText.setText("Password");

        RegisterRePasswordText.setText("Re-type Password");

        RegisterSkillText.setText("Skill Level");

        RegisterDoneButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegisterDoneButton.setText("Done!");
        RegisterDoneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterDoneButtonActionPerformed(evt);
            }
        });

        RegisterUsernameLabel.setForeground(new java.awt.Color(153, 153, 153));
        RegisterUsernameLabel.setText("username");
        RegisterUsernameLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterUsernameLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterUsernameLabelFocusLost(evt);
            }
        });
        RegisterUsernameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUsernameLabelActionPerformed(evt);
            }
        });

        RegisterEmailLabel.setForeground(new java.awt.Color(153, 153, 153));
        RegisterEmailLabel.setText("e-mail");
        RegisterEmailLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterEmailLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterEmailLabelFocusLost(evt);
            }
        });

        RegisterPasswordLabel.setForeground(new java.awt.Color(153, 153, 153));
        RegisterPasswordLabel.setText("asdasdasd");
        RegisterPasswordLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterPasswordLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterPasswordLabelFocusLost(evt);
            }
        });

        RegisterRePasswordLabel.setForeground(new java.awt.Color(153, 153, 153));
        RegisterRePasswordLabel.setText("asdasdasd");
        RegisterRePasswordLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterRePasswordLabelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegisterRePasswordLabelFocusLost(evt);
            }
        });

        RegisterSkillCombobox.setForeground(new java.awt.Color(153, 153, 153));
        RegisterSkillCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Expert" }));
        RegisterSkillCombobox.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegUsernameText)
                            .addComponent(RegisterEmailText)
                            .addComponent(RegisterPasswordText)
                            .addComponent(RegisterRePasswordText)
                            .addComponent(RegisterSkillText))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisterUsernameLabel)
                            .addComponent(RegisterEmailLabel)
                            .addComponent(RegisterPasswordLabel)
                            .addComponent(RegisterRePasswordLabel)
                            .addComponent(RegisterSkillCombobox, 0, 119, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(RegisterDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegUsernameText)
                            .addComponent(RegisterUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegisterEmailText)
                            .addComponent(RegisterEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RegisterPasswordText))
                    .addComponent(RegisterPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterRePasswordText)
                    .addComponent(RegisterRePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterSkillText)
                    .addComponent(RegisterSkillCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterDoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Registration checker
    public boolean verifyFields()
    {
        String username = RegisterUsernameLabel.getText();
        String email = RegisterEmailLabel.getText();
        String pass1 = String.valueOf(RegisterPasswordLabel.getPassword());
        String pass2 = String.valueOf(RegisterRePasswordLabel.getPassword());
        
        //Cheks if fields are filled correctly
        if(username.trim().equals("") || username.trim().equals("username") ||
                email.trim().equals("") || email.trim().equals("e-mail") ||
                pass1.trim().equals("") || pass1.trim().equals("asdasdasd") ||
                pass2.trim().equals("") || pass2.trim().equals("asdasdasd"))
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty!");
            return false;
        }
        //Checks if passwords are the same
        else if(!pass1.equals(pass2))
        {
            JOptionPane.showMessageDialog(null, "Passwords don't match!", "Confirm your password", 2);
            return false;
        }
        
        //If everything is correct
        else
        {
            return true;
        }
    }
    //Username availability checker
    public boolean checkUsername(String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This username already exists", "Please choose a new username", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;

    }
    
    
    
    private void RegisterDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterDoneButtonActionPerformed
       
       
        
        String username = RegisterUsernameLabel.getText();
        String password = String.valueOf(RegisterPasswordLabel.getPassword());
        String email = RegisterEmailLabel.getText();
        String Skill = String.valueOf(RegisterSkillCombobox.getSelectedItem());
        
        if(verifyFields())
        {
            if(!checkUsername(username))
            {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `users`(`username`, `password`, `email`, `SkillLevel`) VALUES (?,?,?,?)";
                
                try {
                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ps.setString(3, email);
                    ps.setString(4, Skill);
                    
                    if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Your account has been Created!");
                        //new form shown
                         Main_Menu form = new Main_Menu();
                         form.setVisible(true);
                         form.pack();
                         form.setLocationRelativeTo(null);
                         //current form close
                         this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error!", "Check your information!", 2);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                
 
            }
        }
        
        
    }//GEN-LAST:event_RegisterDoneButtonActionPerformed

    private void RegisterUsernameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUsernameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterUsernameLabelActionPerformed

    private void RegisterUsernameLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterUsernameLabelFocusGained
      
        //Sets the text to nothing and text color changed to black when focus on the label has been gained.
        if(RegisterUsernameLabel.getText().trim().toLowerCase().equals("username"))
       {
           RegisterUsernameLabel.setText("");
           RegisterUsernameLabel.setForeground(Color.BLACK);
       }
       
    }//GEN-LAST:event_RegisterUsernameLabelFocusGained

    private void RegisterUsernameLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterUsernameLabelFocusLost
      
        //Sets Text to username if their is nothing entered or there has been username entered when focus on the Label has been lost.
        if(RegisterUsernameLabel.getText().trim().toLowerCase().equals("") || 
               RegisterUsernameLabel.getText().trim().toLowerCase().equals("username"))
       {
           RegisterUsernameLabel.setText("username");
           RegisterUsernameLabel.setForeground(new Color(153,153,153));
           
       }
    }//GEN-LAST:event_RegisterUsernameLabelFocusLost

    private void RegisterEmailLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterEmailLabelFocusGained
         //Sets the text to nothing and text color changed to black when focus on the label has been gained.
        if(RegisterEmailLabel.getText().trim().toLowerCase().equals("e-mail"))
       {
           RegisterEmailLabel.setText("");
           RegisterEmailLabel.setForeground(Color.BLACK);
       }
    }//GEN-LAST:event_RegisterEmailLabelFocusGained

    private void RegisterEmailLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterEmailLabelFocusLost
         //Sets Text to username if their is nothing entered or there has been username entered when focus on the Label has been lost.
        if(RegisterEmailLabel.getText().trim().toLowerCase().equals("") || 
               RegisterEmailLabel.getText().trim().toLowerCase().equals("e-mail"))
       {
           RegisterEmailLabel.setText("e-mail");
           RegisterEmailLabel.setForeground(new Color(153,153,153));
           
       }
    }//GEN-LAST:event_RegisterEmailLabelFocusLost

    private void RegisterPasswordLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterPasswordLabelFocusGained
        String pass = String.valueOf(RegisterPasswordLabel.getPassword());
        //Sets the text to nothing and text color changed to black when focus on the label has been gained.
        if(pass.trim().toLowerCase().equals("asdasdasd"))
       {
           RegisterPasswordLabel.setText("");
           RegisterPasswordLabel.setForeground(Color.BLACK);
       }
    }//GEN-LAST:event_RegisterPasswordLabelFocusGained

    private void RegisterPasswordLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterPasswordLabelFocusLost
        String pass = String.valueOf(RegisterPasswordLabel.getPassword());
        //Sets Text to username if their is nothing entered or there has been username entered when focus on the Label has been lost.
        if(pass.trim().toLowerCase().equals(""))
       {
           RegisterPasswordLabel.setText("asdasdasd");
           RegisterPasswordLabel.setForeground(new Color(153,153,153));
           
       }
    }//GEN-LAST:event_RegisterPasswordLabelFocusLost

    private void RegisterRePasswordLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterRePasswordLabelFocusGained
        String pass = String.valueOf(RegisterRePasswordLabel.getPassword());
        //Sets the text to nothing and text color changed to black when focus on the label has been gained.
        if(pass.trim().toLowerCase().equals("asdasdasd"))
       {
           RegisterRePasswordLabel.setText("");
           RegisterRePasswordLabel.setForeground(Color.BLACK);
       }
    }//GEN-LAST:event_RegisterRePasswordLabelFocusGained

    private void RegisterRePasswordLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RegisterRePasswordLabelFocusLost
        
        //Sets Text to username if their is nothing entered or there has been username entered when focus on the Label has been lost.
        String pass = String.valueOf(RegisterRePasswordLabel.getPassword());
        if(pass.trim().toLowerCase().equals(""))
       {
           RegisterRePasswordLabel.setText("asdasdasd");
           RegisterRePasswordLabel.setForeground(new Color(153,153,153));
           
       }
    }//GEN-LAST:event_RegisterRePasswordLabelFocusLost

    private void RegisterMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMinimizeButtonMouseClicked
        
        //Minimize the form when the minimize label is pressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_RegisterMinimizeButtonMouseClicked

    private void RegisterExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterExitButtonMouseClicked
        
        //Exit from the from when the exit button is pressed
        System.exit((0));
    }//GEN-LAST:event_RegisterExitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegUsernameText;
    private javax.swing.JButton RegisterDoneButton;
    private javax.swing.JTextField RegisterEmailLabel;
    private javax.swing.JLabel RegisterEmailText;
    private javax.swing.JLabel RegisterExitButton;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel RegisterMinimizeButton;
    private javax.swing.JPasswordField RegisterPasswordLabel;
    private javax.swing.JLabel RegisterPasswordText;
    private javax.swing.JPasswordField RegisterRePasswordLabel;
    private javax.swing.JLabel RegisterRePasswordText;
    private javax.swing.JComboBox<String> RegisterSkillCombobox;
    private javax.swing.JLabel RegisterSkillText;
    private javax.swing.JTextField RegisterUsernameLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
