package com.initialquiz.frame;

import nl.captcha.Captcha;
import com.initialquiz.captcha.captchaGenerate;
import com.initialquiz.controller.LoginController;
import com.initialquiz.dto.UserDTO;
import com.initialquiz.service.UserService;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class LoginFrame extends javax.swing.JFrame {
    private captchaGenerate  captchaGenerator;
    private String captchaAnswer = null;
    
    public LoginFrame() {
        System.out.println("=======LoginFrame=======");
        
        captchaGenerator = new captchaGenerate();
        
        initComponents();
        
        showCaptchaImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signupLabel = new javax.swing.JLabel();
        loginFailedMessage = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        ChangeCaptchaImage = new javax.swing.JButton();
        captchaImg = new javax.swing.JLabel();
        captchaUserInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginBtn.setText("로그인");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("Initial Quiz");

        signupLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        signupLabel.setForeground(new java.awt.Color(0, 0, 255));
        signupLabel.setText("회원가입");
        signupLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLabelMouseClicked(evt);
            }
        });

        loginFailedMessage.setForeground(new java.awt.Color(255, 0, 0));

        ChangeCaptchaImage.setText("새로고침");
        ChangeCaptchaImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeCaptchaImageActionPerformed(evt);
            }
        });

        jLabel4.setText("Captcha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(loginFailedMessage))
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(captchaUserInput)
                    .addComponent(captchaImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(usernameField)
                    .addComponent(passwordField)
                    .addComponent(signupLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangeCaptchaImage)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(loginFailedMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ChangeCaptchaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(captchaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(captchaUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(signupLabel)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showCaptchaImage(){
        Captcha captchaImage = captchaGenerator.getcaptcha();
        captchaAnswer = captchaImage.getAnswer();
        captchaImg.setIcon(new ImageIcon(captchaImage.getImage()));
    }
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        try {
            String inputData = null;
            System.out.println(captchaAnswer);
            if(captchaUserInput.getText() != null){
                inputData = captchaUserInput.getText();
            }
            if(captchaAnswer.equals(inputData)){
                UserDTO loginUser = new UserDTO();
                loginUser.setUsername(usernameField.getText());
               loginUser.setPasswd(String.valueOf(passwordField.getPassword()));

                LoginController loginController = new LoginController(this, new UserService());

                loginController.handleLogin(loginUser);
            }
            else{
                usernameField.setText("");
                passwordField.setText("");
                captchaUserInput.setText("");
                showCaptchaImage();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signupLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupLabelMouseClicked
        SignupFrame signupFrame = new SignupFrame(this);
        this.setVisible(false);
        signupFrame.setVisible(true);
    }//GEN-LAST:event_signupLabelMouseClicked

    private void ChangeCaptchaImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeCaptchaImageActionPerformed
        showCaptchaImage();
    }//GEN-LAST:event_ChangeCaptchaImageActionPerformed

    public void resetLogin() {
        usernameField.setText("");
        passwordField.setText("");
        loginFailedMessage.setText("로그인 실패!");
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeCaptchaImage;
    private javax.swing.JLabel captchaImg;
    private javax.swing.JTextField captchaUserInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginFailedMessage;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel signupLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
